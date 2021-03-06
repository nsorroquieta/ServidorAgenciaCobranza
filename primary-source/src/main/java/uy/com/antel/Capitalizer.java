package uy.com.antel;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.google.gson.Gson;

public class Capitalizer extends Thread {

    private Socket clientSocket;
    private int clientNumber;
    private DataOutputStream output = null;
    private PrintWriter out;
    private DataInputStream in;

    public Capitalizer(Socket clientSocket, int clientNumber) {
        this.clientSocket = clientSocket;
        this.clientNumber = clientNumber;
        System.out.println("Se genero una conxion("+clientNumber+")");
    }

    /**
     * Empieza a funcionar el hilo de comunicación.
     * Primero recive los datos.
     * Luego crea el ticket
     * Por ultimo responde a la petición.
     */
    public void run(){
        String line = this.reciveMessage();
        String msg = this.crearTicket(line);
        this.sendMessage(msg);
    }

    /**
     * Función que recive un mensaje, y lo envía por el socket que está generado.
     * @param msg
     */
    private void sendMessage(String msg){
        try {
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            pw.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Función que escucha la comunicación del socket hasta recibir un texto
     * @return devuelve el texto leido en el socket
     */
    private String reciveMessage(){
        String line = "";
        try {
            in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            boolean flagRead = true;
            while (flagRead)
            {
                if(line != null){
                    try
                    {
                        line = input.readLine();
                        flagRead = false;
                    }
                    catch(IOException i)
                    {
                        System.out.println("cayo la lectura.");
                        System.out.println(i);
                    }
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return line;
    }


    /**
     *en esta función se crea el ticket
     * Devuelve el texto que se debe responder a la terminal
     * false: La venta del ticket no pudo realizarse.
     * true: El ticket se generó correctamente: id = XXXXX
     * siendo XXXX el id del ticket generado;
     */
    private String crearTicket(String jsonData){
        voInputData inputData = new Gson().fromJson(jsonData,voInputData.class);
        QueriesAgency queries = new QueriesAgency();

        try {

            if(inputData.getCommand().equals("buyTicket"))
            {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                Date startDate = formatter.parse(inputData.getStartDate());
                Ticket ticket  = new Ticket(inputData.getCarRegistration(),startDate,Integer.parseInt(inputData.getMinutes()));

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String startDateAsString = sdf.format(ticket.getStartDate());
                String saleDate = sdf.format(Calendar.getInstance().getTime());

                WebServiceIMMService ws = new WebServiceIMMService();
                int buyTicketResponse = ws.getWebServiceIMMPort().comprarTicket(ticket.getAgencyID(), ticket.getCarRegistration(), saleDate, inputData.getStartDate(), ticket.getMinutes());
                //int buyTicketResponse = ws.getWebServiceIMMPort().comprarTicket(ticket.getAgencyID(), ticket.getCarRegistration(), startDateAsString, inputData.getStartDate(), ticket.getMinutes());
                //String buyTicketResponse = ws.getWebServiceIMMPort().comprarTicket(ticket.getAgencyID(), ticket.getCarRegistration(), startDateAsString, inputData.getStartDate(), ticket.getMinutes());
                //ticket.setTicketID(Integer.parseInt(buyTicketResponse));
                ticket.setTicketID(buyTicketResponse);

                ticket.setPrice(ws.getWebServiceIMMPort().calcularCosto(ticket.getMinutes()));

                TicketPersist ts = new TicketPersist(ticket);
                boolean result = ts.guardarDatos();
                if(result)
                {
                    return "Se creo el Ticket "+ buyTicketResponse+" para la matricula: " + ticket.getCarRegistration()+ "-: $  "+ticket.getPrice();
                } else {
                    return "Ocurrio un error al intentar guardar el ticket en la base de datos de la Agencia";
                }
            }
            if(inputData.getCommand().equals("cancelTicket"))
            {
                int idTicket = Integer.parseInt(inputData.getTicketId());
                System.out.println("Anula Idtiket"+idTicket);
                WebServiceIMMService ws = new WebServiceIMMService();
                int cancellResponse = ws.getWebServiceIMMPort().cancellationRequest(5,idTicket);
                boolean result = queries.anulaTicket(idTicket);
                if(result)
                {
                    return "Se elimino el Ticket "+ inputData.getTicketId()+" ";
                } else {
                    return "Ocurrio un error al intentar anular el ticket en la base de datos de la Agencia";
                }
            }

        }catch (ParseException e) { e.printStackTrace(); }
        return "nada";

        /*
        ticket.setStartDate(ticket.getStartDate());

        //String response = ws.getWebServiceIMMPort().test("Texto de prueba");
        //System.out.println("response:" + response);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String salesDate = dateFormat.format(ticket.getSalesDateTime());
        String startDate = dateFormat.format(ticket.getStartDateTime());

        System.out.println("sales respose:" + salesResponse);
                return "CREAR TICKET: Command: " + inputData.getCommand() + "StartDate: " + inputData.getStartDate() + "carRegistration: " + inputData.getCarRegistration() + "minutes: " + inputData.getMinutes();

        */
    }
}

