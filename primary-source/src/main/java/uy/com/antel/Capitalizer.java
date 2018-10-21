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

    public void run(){
        System.out.println("Empieza a correr un nuevo Hilo.");
        // takes input from the client socket
        try {
            in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));

        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String line = "";

        // reads message from client until "Over" is sent
        System.out.println("entro");
        boolean flagRead = true;
        while (flagRead)
        {
            if(line != null){
                System.out.println("do something");
                try
                {
                    line = input.readLine();
                    flagRead = false;
                    System.out.println("La consola Lee: "+line);

                }
                catch(IOException i)
                {
                    System.out.println("cayo la lectura.");
                    System.out.println(i);
                }
            }
        }
            System.out.println("Aqui genero el ticket"+line);
        //respondo OK + idTiket o False;
        this.sendMessage("muy bien}");
        System.out.println("Closing connection");
        // close connection
        clientSocket.close();
        input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void sendMessage(String msg){
        try {
            System.out.println("Intento de envío");
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            pw.println("hello world");
            pw.close();
//            output = new DataOutputStream(clientSocket.getOutputStream());
  //          output.writeBytes(msg);
            //output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
