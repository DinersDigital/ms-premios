package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;
import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class PremioCommandServiceImpl implements IPremioCommandService{
	
	@Inject
	IRepository premioRepository;
	
	@Override
	public void createPremioCommand(CreatePremioCommand command) {
		premioRepository.crearPremio(new Premio(command.getId(), command.getIdCliente(), command.getIdCampania(), command.getValorPremio(), command.getStatus()));
		
	}

	@Override
	public void removePremioCommand(int id) {
		premioRepository.getClass();
		
	}
	
}
