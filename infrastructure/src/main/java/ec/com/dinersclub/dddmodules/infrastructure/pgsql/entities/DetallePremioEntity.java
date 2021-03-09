package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "detalle_premio")
public class DetallePremioEntity extends PanacheEntityBase {

	@Id
	@GeneratedValue
	private Integer id;
	private String meta;
	private String nombreRango;
	private Double valorPremio;
	
    @ManyToOne
    private PremioEntity premioEntity;
    
    
	
	public DetallePremioEntity() {
		
	}

	public DetallePremioEntity(Integer id, String meta, String nombreRango, Double valorPremio,
			PremioEntity premioEntity) {
		
		this.id = id;
		this.meta = meta;
		this.nombreRango = nombreRango;
		this.valorPremio = valorPremio;
		this.premioEntity = premioEntity;
	}
	
	public DetallePremioEntity(Integer id, String meta, String nombreRango, Double valorPremio) {
		super();
		this.id = id;
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
	public Integer getId() {
		return id;
	}
	

}