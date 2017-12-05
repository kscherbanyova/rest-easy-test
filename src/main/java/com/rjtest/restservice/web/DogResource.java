package com.rjtest.restservice.web;

import com.rjtest.restservice.dao.DogDaoImpl;
import com.rjtest.restservice.dao.api.Dog;
import com.rjtest.restservice.dao.api.DogDao;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created by eshcherbanova on 11/19/17.
 */

@Path("/dogs")
public class DogResource {

    DogDao dogDao = new DogDaoImpl();

    @GET
    @Produces("application/json")
    public Collection<Dog> getDogs() {
      return dogDao.getAll();
    }


    @GET
    @Path("{id}")
    public Dog getDog(@QueryParam("isbn") Integer id) {
      return dogDao.get(id);
    }

    @POST
    //@Path("{id}")
    @Consumes("application/json")
    @Produces("text/plain")
    public Response addDog(Dog dog)
    {
      dogDao.add(dog);
      return Response.created(null).entity("Dog created successfully").build();
    }

}
