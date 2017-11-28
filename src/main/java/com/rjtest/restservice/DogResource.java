package com.rjtest.restservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by eshcherbanova on 11/19/17.
 */

@Path("/dogs")
public class DogResource {

    @GET
    @Produces("application/json")
    public List<Dog> getDogs() {
      return DogsRepository.getDogs();
    }


    @GET
    @Path("{id}")
    public String getDog(@QueryParam("isbn") String id) {
      return "id=" + id;
    }


    @POST
    @Path("{id}")
    @Consumes("application/json")
    @Produces("text/plain")
    public Response getById(@PathParam("id") String id, Dog dog)
    {
      DogsRepository.addDog(dog);
      return Response.created(null).entity("Dog created successfully").build();
    }


}
