package ec.com.dinersclub.dddmodules.domain.model;

public class DetallePremio {

	private Integer id;
	private String meta;
	private String nombreRango;
	private Double valorPremio;
	
	
	
	public DetallePremio() {
		
	}


	public DetallePremio(Integer id, String meta, String nombreRango, Double valorPremio) {
		
		this.id = id;
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
	}
	
	
	public DetallePremio(String meta, String nombreRango, Double valorPremio) {
		
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
	}


	public Integer getId() {
		return id;
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
	
	






}