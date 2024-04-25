import java.rmi.*;

public class Server {

    public static void main(String[] args) {
        try {
            ServerAppImpl serverAppImpl = new ServerAppImpl();   // stub object
            Naming.rebind("Server", serverAppImpl);             
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}