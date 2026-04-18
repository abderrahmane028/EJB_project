package ejbprojects.demoejb;

import ejbprojects.demoejb.service.IGestion;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

@Path("/hello-world")
public class HelloResource {
    @GET
    public String hello() {
        return "Hello, World!";
    }
}