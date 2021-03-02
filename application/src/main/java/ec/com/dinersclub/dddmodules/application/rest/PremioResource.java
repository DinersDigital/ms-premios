package ec.com.dinersclub.dddmodules.application.rest;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.IPremioCommandService;
import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;

@Path("/premios")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PremioResource {

	@Inject
	IPremioCommandService writeService;

    @POST
    public Response add(@Valid CreatePremioCommand command) {
    	writeService.createPremioCommand(command);
    	return Response.status(201).build();
    }


}