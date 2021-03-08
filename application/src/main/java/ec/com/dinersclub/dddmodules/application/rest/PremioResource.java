package ec.com.dinersclub.dddmodules.application.rest;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.IPremioCommandService;
import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.IPremioQueryService;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.PremioQuery;

@Path("/premios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PremioResource {

	@Inject
	IPremioCommandService writeService;
	
	@Inject
	IPremioQueryService readService;
	
    @GET
    public List<PremioQuery> list() {
        return readService.getAll();
    }

    @POST
    public Response add(@Valid CreatePremioCommand command) {
    	writeService.createPremioCommand(command);
    	return Response.status(201).build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@NotBlank(message="id may not be blank") @PathParam(value = "id") String id) {
    	writeService.removePremioCommand(id);
    	return Response.status(200).build();
    }

}