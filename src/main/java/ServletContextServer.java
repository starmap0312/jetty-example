import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServletContextServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        // use ServletContextHandler:
        // ServletContextHandler maps to a servlet
        // you can wire things up by adding servlets to the ServletContextHandler programmatically, or with web.xml definitions
        // add Servlet class & path mapping (can be defined  as well)
        ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        handler.setContextPath("/");
        handler.addServlet(HelloServlet.class, "/hello");
        server.setHandler(handler);
        server.start();
        server.join();
        // http://localhost:8080/hello
    }
}
