package ec.com.dinersclub.dddmodules.application.rest;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreateTarjetaCommand;
import ec.com.dinersclub.dddmodules.application.services.ConsumoService;
import ec.com.dinersclub.dddmodules.application.services.TarjetaService;
import ec.com.dinersclub.dddmodules.domain.model.Premio;





@Path("/grpc")
public class GrpcResource {
	
	@Inject
    TarjetaService client;
	
	@Inject
	ConsumoService clientConsumo;
	

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @POST
    @Path("tarjetas")
    public Response add(@Valid CreateTarjetaCommand command) {
    	client.createTarjetaCommand(command);
    	return Response.status(201).build();
    } 
    
    @GET
    @Path("premios/{id}")
    public List<Premio> add(@PathParam("id") Integer id) {
    	
	   	return clientConsumo.createPremioCommand(id);
	   	
    } 

     
}