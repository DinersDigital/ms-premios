package ec.com.dinersclub.dddmodules.application.cqrs.commands.dto;

import javax.validation.constraints.NotBlank;

public class CreatePremioCommand {
	
    @NotBlank(message="id may not be blank")
	private String id; 
    private String idCliente;
    private String idCampania;
    private String valorPremio;
    private String status;
	public @NotBlank(message = "id may not be blank") String getId() {
		return id;
	}
	public void setId(@NotBlank(message = "id may not be blank") String id) {
		this.id = id;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public String getIdCampania() {
		return idCampania;
	}
	public void setIdCampania(String idCampania) {
		this.idCampania = idCampania;
	}
	public String getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(String valorPremio) {
		this.valorPremio = valorPremio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}
