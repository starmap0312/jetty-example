import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class ServletContextServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        // use ServletContextHandler:
        // ServletContextHandler maps to a servlet
        // you can wire things up by adding servlets to the ServletContextHandler programmatically, or with web.xml definitions
        // add Servlet class & path mapping (can be defined  as well)
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        context.addServlet(HelloServlet.class, "/hello");
        server.setHandler(context);
        server.start();
        server.join();
        // http://localhost:8080/hello
    }
}
