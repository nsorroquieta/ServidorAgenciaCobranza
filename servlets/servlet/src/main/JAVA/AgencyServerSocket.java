import uy.com.antel.Capitalizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.ServerSocket;

@WebServlet(urlPatterns = "/AgencyServerSocket", loadOnStartup = 1)
public class AgencyServerSocket extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("EL SERVIDOR ESTÀ FUNCIONANDO");
        int clientNumber = 0;
        ServerSocket listener = null;
        try {
            listener = new ServerSocket(9898);
            while(true){
                new Capitalizer(listener.accept(), clientNumber++).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                listener.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
