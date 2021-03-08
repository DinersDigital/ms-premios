package ec.com.dinersclub.dddmodules.application.cqrs.commands.dto;

import javax.validation.constraints.NotBlank;

public class CreatePremioCommand {
	
    @NotBlank(message="id may not be blank")
	private Integer id; 
    private Integer idCliente;
    private Integer idCampania;
    private Double valorPremio;
    private String status;
	public @NotBlank(message = "id may not be blank") Integer getId() {
		return id;
	}
	public void setId(@NotBlank(message = "id may not be blank") Integer id) {
		this.id = id;
	}

	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdCampania() {
		return idCampania;
	}
	public void setIdCampania(Integer idCampania) {
		this.idCampania = idCampania;
	}
	public Double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
}
