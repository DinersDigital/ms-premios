package ec.com.dinersclub.dddmodules.application.cqrs.commands;

import ec.com.dinersclub.dddmodules.application.cqrs.commands.dto.CreatePremioCommand;

public interface IPremioCommandService {
	
	void createPremioCommand(CreatePremioCommand command);
	
	void removePremioCommand(int id);

}
