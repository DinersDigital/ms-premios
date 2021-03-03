package ec.com.dinersclub.dddmodules.application.grpc;

import javax.inject.Inject;
import javax.inject.Singleton;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.IPremioCommandService;
import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;
import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;


@Singleton                                                                                   
public class PremioResource extends MutinyPremioGrpc.PremioImplBase {      
	
	@Inject
	IPremioCommandService writeService;

    @Override
    @Blocking
    public Uni<PremioResponse> createPremioCommand(PremioRequest request) { 
    	String id = request.getId();
    	String idCliente = request.getIdCliente();
        String idCampania= request.getIdCampania();
        String valorPremio= request.getValorPremio();
        String status = "1";
        CreatePremioCommand command = new CreatePremioCommand();
        command.setId(id);
        command.setIdCliente(idCliente);
        command.setIdCampania(idCampania);
        command.setValorPremio(valorPremio);
        command.setStatus(status);
        writeService.createPremioCommand(command);
        return Uni.createFrom().item(PremioResponse.newBuilder().setId(id).build());
		
        
    }
}