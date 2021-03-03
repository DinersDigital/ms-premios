package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ec.com.dinersclub.dddmodules.domain.model.Premio;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "premio")
public class PremioEntity extends PanacheEntityBase {
	
	@Id
	private String id; 
    private String idCliente;
    private String idCampania;
    private String valorPremio;
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
      
      
    public PremioEntity(String id, String idCliente, String idCampania, String valorPremio, String status) {
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
        return new Premio(getId(), getIdCliente(), getIdCampania(), getValorPremio(),getStatus());
    }

	public String getId() {
		return id;
	}


	public void setId(String id) {
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