package ec.com.dinersclub.dddmodules.domain.model;

public class Premio {

	private Integer id; 
    private String idCliente;
    private String idCampania;
    private String valorPremio;
    private String status;
	public Integer getId() {
		return id;
	}
	
	
	
	public Premio(Integer id, String idCliente, String idCampania, String valorPremio, String status) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.valorPremio = valorPremio;
		this.status = status;
	}



	public void setId(Integer id) {
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