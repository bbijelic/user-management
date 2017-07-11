package com.github.bbijelic.users.resources;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.github.bbijelic.users.representations.User;

/**
 * User resource
 * 
 * @author Bojan Bijelić <bojan.bijelic.os@gmail.com>
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    /**
     * Creates new user
     * @param user the user
     */
    @POST
    public Response create(@NotNull @Valid User user){
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }
    
    /**
     * Fetches user and returns it
     */
    @GET
    @Path("/{alias}")
    public User read(@NotNull @Valid @PathParam("alias") String alias){
        throw new WebApplicationException(Status.NOT_FOUND);
    }
    
    /**
     * Updates user
     */
    @PUT
    public Response update(@NotNull @Valid User user){
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }
    
    /**
     * Deletes user
     */
    @DELETE
    @Path("/{alias}")
    public Response delete(@NotNull @Valid @PathParam("alias") String alias){
        return Response.status(Status.NOT_IMPLEMENTED).build();
    }
        
}
