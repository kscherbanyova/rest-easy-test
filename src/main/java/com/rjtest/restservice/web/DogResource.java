package com.rjtest.restservice.web;

import com.rjtest.restservice.model.Dog;
import com.rjtest.restservice.service.DogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by eshcherbanova on 11/19/17.
 */

@Path("/dogs")
@Controller
public class DogResource {

    @Autowired
    DogService service;

    @GET
    @Produces("application/json")
    public Collection<Dog> getDogs() {
      return service.getDogs();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Dog getDog(@PathParam("id") String id) {
      return service.getDog(id);
    }

    @POST
    @Consumes("application/json")
    public Response addDog(Dog dog)
    {
      service.addDog(dog);
      return Response.created(null).entity("Dog created successfully").build();
    }
}
