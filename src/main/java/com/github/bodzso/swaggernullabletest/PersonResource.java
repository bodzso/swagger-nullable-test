package com.github.bodzso.swaggernullabletest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/person")
@Produces(value = "application/json")
public class PersonResource {
  @GET
  public Person get() {
    return new Person();
  }

  @POST
  public Response post(Person person) {
    return Response.ok().entity("SUCCESS").build();
  }
}
