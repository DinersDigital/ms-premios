package ec.com.dinersclub.dddmodules.domain.model;

public class Premio {

	private Integer id;
	private Integer idCliente;
	private Integer idCampania;
	private Double valorPremio;
	private String status;

	public Integer getId() {
		return id;
	}

	public Premio(Integer id, Integer idCliente, Integer idCampania, Double valorPremio, String status) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.valorPremio = valorPremio;
		this.status = status;
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

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}