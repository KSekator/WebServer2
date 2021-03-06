import org.eclipse.jetty.io.ssl.ALPNProcessor;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class MyServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server(88);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.addServlet(DefaultServlet.class, "/");
        handler.addServlet(GreetServlet.class, "/greet.html");
        handler.setResourceBase(".");
        server.start();
    }
}
