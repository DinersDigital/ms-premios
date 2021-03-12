package ec.com.dinersclub.dddmodules.domain.model;

public class DetallePremio {

	
	private String meta;
	private String nombreRango;
	private Double valorPremio;
	private String estado;
	
	
	
	public DetallePremio() {
		
	}


	public DetallePremio(String meta, String nombreRango, Double valorPremio, String estado) {
		
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
		this.estado = estado;
	}
	
	

	public DetallePremio(String meta, String nombreRango, Double valorPremio) {
		super();
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
	}


	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getNombreRango() {
		return nombreRango;
	}
	public void setNombreRango(String nombreRango) {
		this.nombreRango = nombreRango;
	}
	public Double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	






}