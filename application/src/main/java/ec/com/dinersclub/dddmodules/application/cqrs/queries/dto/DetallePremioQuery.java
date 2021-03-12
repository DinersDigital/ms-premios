package ec.com.dinersclub.dddmodules.application.cqrs.queries.dto;

public class DetallePremioQuery {
	
	private String meta;
	private String nombreRango;
	private Double valorPremio;
	private Integer idCliente;
	private String estado;
    
    public DetallePremioQuery() {
    }
    
    

	public DetallePremioQuery(String meta, String nombreRango, Double valorPremio, Integer idCliente, String estado) {
		super();
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
		this.idCliente = idCliente;
		this.estado = estado;
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

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    


}
