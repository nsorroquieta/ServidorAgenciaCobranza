import uy.com.antel.Capitalizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@WebServlet(urlPatterns = "/AgencyServerSocket", loadOnStartup = 1)
public class AgencyServerSocket extends HttpServlet {

    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       =  null;
    private int clientNumber = 0;

    @Override
    public void init() throws ServletException {
        super.init();
            // starts server and waits for a connection
            try
            {
                server = new ServerSocket(9898);
                System.out.println("Server started");

                System.out.println("Waiting for a client ...");

                while(true) {
                    socket = server.accept();
                    System.out.println("Client accepted");
                    new Capitalizer(socket, clientNumber++).start();
                }

            }
            catch(IOException i)
            {
                System.out.println(i);
            }



        /**Funciona anterior.**/
        /*
        System.out.println("EL SERVIDOR FUNCIONA");
        int clientNumber = 0;
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(9898);
            clientSocket = serverSocket.accept();
                new Capitalizer(clientSocket, clientNumber++).start();

        } catch (IOException e) {
            System.out.println("es aca");
            e.printStackTrace();
        }finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.out.println("o es aca");
                e.printStackTrace();
            }
        }*/

    }
}
