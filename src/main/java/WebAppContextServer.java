import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class WebAppContextServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        // use WebAppContext:
        // WebAppContext represents a traditional webapp like a war file
        // WebappContext brings all the automatic deployment and wiring of things up only with the web.xml
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setResourceBase("./src/main/webapp");
        server.setHandler(context);
        server.start();
        server.join();
        // http://localhost:8080/hello
    }
}