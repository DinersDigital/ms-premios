package ec.com.dinersclub.dddmodules.application.cqrs.commands.dto;

import java.util.ArrayList;
import java.util.List;

import ec.com.dinersclub.dddmodules.domain.model.DetallePremio;

public class CreatePremioCommand {
	
	private Integer id;
	private Integer idCliente;
	private Integer idCampania;
	private String nombreCampania;
	private Double montoTotalCampania;
	private String estadoCampania;
	private Double valorTotalConsumos;
	private List<DetallePremio> listDetallePremio= new ArrayList<>();
	
	
	
	public CreatePremioCommand() {
		
	}


	public CreatePremioCommand(Integer id, Integer idCliente, Integer idCampania, String nombreCampania,
			Double montoTotalCampania, String estadoCampania, Double valorTotalConsumos,
			List<DetallePremio> listDetallePremio) {
		
		this.id = id;
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.nombreCampania = nombreCampania;
		this.montoTotalCampania = montoTotalCampania;
		this.estadoCampania = estadoCampania;
		this.valorTotalConsumos = valorTotalConsumos;
		this.listDetallePremio = listDetallePremio;
	}
	
	
	public CreatePremioCommand(Integer idCliente, Integer idCampania, String nombreCampania, Double montoTotalCampania,
			String estadoCampania, Double valorTotalConsumos, List<DetallePremio> listDetallePremio) {
		
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.nombreCampania = nombreCampania;
		this.montoTotalCampania = montoTotalCampania;
		this.estadoCampania = estadoCampania;
		this.valorTotalConsumos = valorTotalConsumos;
		this.listDetallePremio = listDetallePremio;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEstadoCampania() {
		return estadoCampania;
	}
	public void setEstadoCampania(String estadoCampania) {
		this.estadoCampania = estadoCampania;
	}
	public Double getValorTotalConsumos() {
		return valorTotalConsumos;
	}
	public void setValorTotalConsumos(Double valorTotalConsumos) {
		this.valorTotalConsumos = valorTotalConsumos;
	}
	public List<DetallePremio> getListDetallePremio() {
		return listDetallePremio;
	}
	public void setListDetallePremio(List<DetallePremio> listDetallePremio) {
		this.listDetallePremio = listDetallePremio;
	}
	public String getNombreCampania() {
		return nombreCampania;
	}
	public void setNombreCampania(String nombreCampania) {
		this.nombreCampania = nombreCampania;
	}
	public Double getMontoTotalCampania() {
		return montoTotalCampania;
	}
	public void setMontoTotalCampania(Double montoTotalCampania) {
		this.montoTotalCampania = montoTotalCampania;
	}

    
    
    
}
