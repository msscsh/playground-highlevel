package br.com.msscsh.quarkus;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/private")
public class PrivateResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloPrivate() {
        return "Hello from private";
    }
}
