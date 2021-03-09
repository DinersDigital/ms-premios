package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosGrpc;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped
public class ConsumoCommandServiceImpl implements IConsumoCommandService{
	
	
	@Inject
	@GrpcService("consumo")
	ConsumosRegistradosGrpc.ConsumosRegistradosBlockingStub client;

	@Override
	public void createPremioCommand(CreatePremioCommand command) {
		ConsumosRegistradosResponse consumo = client.verificarConsumosRegistradosCliente(ConsumosRegistradosRequest.newBuilder().setIdCliente(command.getIdCliente()).build());
		
	}

	@Override
	public void removePremioCommand(Integer id) {

		
	}
	

	
	

	

	
	
}
