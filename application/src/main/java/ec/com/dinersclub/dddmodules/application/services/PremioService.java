package ec.com.dinersclub.dddmodules.application.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;
import ec.com.dinersclub.dddmodules.application.grpc.MutinyPremioGrpc;
import ec.com.dinersclub.dddmodules.application.grpc.PremioRequest;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped  
public class PremioService {

	@Inject
    @GrpcService("premio")                     
	MutinyPremioGrpc.MutinyPremioStub grpc;
	
	public void createPremioCommand(CreatePremioCommand command) {
		grpc.createPremioCommand(PremioRequest.newBuilder().setId(command.getId()).setIdCampania(command.getIdCampania()).setIdCliente(command.getIdCliente()).setValorPremio(command.getValorPremio()).build()).await().indefinitely();
		}
	
}
