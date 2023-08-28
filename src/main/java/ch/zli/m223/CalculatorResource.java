package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/calculator/add/")
public class CalculatorResource {

    @GET @Path("{summand1}/{summand2}")
    public int sum(@PathParam("summand1") int summand1, @PathParam("summand2") int summand2) {
        return summand1 + summand2;
    }


}