package ec.com.dinersclub.dddmodules.domain.model;

import java.util.ArrayList;
import java.util.List;




public class Premio {
	
	

	private Integer idCliente;
	private Integer idCampania;
	private String nombreCampania;
	private Double montoTotalCampania;
	private String estadoCampania;
	private Double valorTotalConsumos;
	private List<DetallePremio> listDetallePremio= new ArrayList<>();
	private String estadoPremio;
	
	
	public Premio() {
		
	}

	public Premio(Integer idCliente, Integer idCampania, String nombreCampania, Double montoTotalCampania,
			String estadoCampania, Double valorTotalConsumos, List<DetallePremio> listDetallePremio, String estadoPremio) {
		
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.nombreCampania = nombreCampania;
		this.montoTotalCampania = montoTotalCampania;
		this.estadoCampania = estadoCampania;
		this.valorTotalConsumos = valorTotalConsumos;
		this.listDetallePremio = listDetallePremio;
		this.estadoPremio = estadoPremio;
	}
	
	public Premio(Integer idCliente, Integer idCampania, String nombreCampania, Double montoTotalCampania,
			String estadoCampania, Double valorTotalConsumos, List<DetallePremio> listDetallePremio) {
		
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.nombreCampania = nombreCampania;
		this.montoTotalCampania = montoTotalCampania;
		this.estadoCampania = estadoCampania;
		this.valorTotalConsumos = valorTotalConsumos;
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

	public String getEstadoPremio() {
		return estadoPremio;
	}

	public void setEstadoPremio(String estadoPremio) {
		this.estadoPremio = estadoPremio;
	}

}