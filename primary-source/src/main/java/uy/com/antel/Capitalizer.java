package uy.com.antel;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Capitalizer extends Thread {

    private Socket clientSocket;
    private int clientNumber;
    private DataOutputStream output = null;
    private PrintWriter out;
    private DataInputStream in;

    public Capitalizer(Socket clientSocket, int clientNumber) {
        this.clientSocket = clientSocket;
        this.clientNumber = clientNumber;
        System.out.println("Se genero una nuevo coexión núm: "+clientNumber);
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
        String response = "La venta del ticket no pudo realizarse.";
        return response;
    }


}
