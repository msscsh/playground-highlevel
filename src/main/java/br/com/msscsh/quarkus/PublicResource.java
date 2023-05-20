package br.com.msscsh.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/public")
public class PublicResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloPublic() {
        return "Hello from public";
    }
}
