package org.soujava;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("animals")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class AnimalResource {

    @Inject
    private AnimalRepository repository;

    @POST
    public void create(Animal entity) {
        repository.save(entity);
    }

    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") String id, Animal entity) {
        repository.save(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        repository.deleteById(id);
    }

    @GET
    @Path("{id}")
    public Animal find(@PathParam("id") String id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new WebApplicationException(Response.Status.NOT_FOUND));
    }

    @GET
    public List<Animal> findAll() {
        return repository.findAll();
    }

}