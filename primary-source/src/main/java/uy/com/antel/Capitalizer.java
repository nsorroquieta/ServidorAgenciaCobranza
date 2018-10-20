package uy.com.antel;

import java.io.*;
import java.net.Socket;
import java.sql.SQLOutput;

public class Capitalizer extends Thread {

    private Socket clientSocket;
    private int clientNumber;
    private PrintWriter out;
    private BufferedReader in;

    public Capitalizer(Socket clientSocket, int clientNumber) {
        this.clientSocket = clientSocket;
        this.clientNumber = clientNumber;
        System.out.println("new connection with client· "+clientNumber+" at "+ clientSocket);
    }

    public void run(){
        System.out.println("ejecuto RUN");
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String recivedMessage = in.readLine();
            System.out.println(recivedMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
/*        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                String input = in.readLine();
                if(input == null || input.equals(".")) {
                    if(input!=null) {
                        System.out.println(input);
                    }
                }else{
                   System.out.println("elsa:::"+input);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
