package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "premio")
public class PremioEntity extends PanacheEntityBase {
	
	@Id
	private Integer id; 
    private Integer idCliente;
    private Integer idCampania;
    private Double valorPremio;
    private String status;
    
   
    
    public PremioEntity() {
		
	}


	public PremioEntity(Premio premio) {

		this.id = premio.getId();
		this.idCliente = premio.getIdCliente();
		this.idCampania = premio.getIdCampania();
		this.valorPremio = premio.getValorPremio();
		this.status = premio.getStatus();
    	
    }
      
      
    public PremioEntity(Integer id, Integer idCliente, Integer idCampania, Double valorPremio, String status) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.valorPremio = valorPremio;
		this.status = status;
	}

    
    public static List<Premio> map(List<PremioEntity> premios) {
   	 List<Premio> premioList = new ArrayList<>();
       if (premios == null) {
           return premioList;
       }
       List<Premio> list = new ArrayList<>(premios.size());
       for (PremioEntity premio : premios) {
           list.add(premio.toPremio());
       }

       return list;
   }
    
    public Premio toPremio() {
        return new Premio(getId(), getIdCliente(), getIdCampania(), getValorPremio(), getStatus());
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