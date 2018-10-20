import uy.com.antel.Capitalizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@WebServlet(urlPatterns = "/AgencyServerSocket", loadOnStartup = 1)
public class AgencyServerSocket extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("EL SERVIDOR FUNCIONA");
        int clientNumber = 0;
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(9898);
            clientSocket = serverSocket.accept();
            while(true){
                new Capitalizer(clientSocket, clientNumber++).start();
            }

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
        }

    }
}
