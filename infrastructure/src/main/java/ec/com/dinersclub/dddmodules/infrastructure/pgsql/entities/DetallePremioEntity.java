package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "detallepremio")
public class DetallePremioEntity extends PanacheEntityBase {

	@Id
	@SequenceGenerator(
	        name = "secuenciaDetallePremio",
	        sequenceName = "detpre_id_seq",
	        allocationSize = 1,
	        initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuenciaDetallePremio")
	@Column(name="iddetallepremio"  ,nullable=false, updatable =false)
	private Integer idDetallePremio;
	
	private String meta;
	private String nombreRango;
	private Double valorPremio;
	private Integer idCliente;
	private String estado;
	
	@Column(nullable=false)
	private Integer idPremio; 

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPremio", referencedColumnName = "idPremio", insertable = false, updatable = false)
	private PremioEntity premioEntity;


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

	public PremioEntity getPremioEntity() {
		return premioEntity;
	}

	public void setPremioEntity(PremioEntity premioEntity) {
		this.premioEntity = premioEntity;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(Integer idPremio) {
		this.idPremio = idPremio;
	}
	public Integer getIdDetallePremio() {
		return idDetallePremio;
	}

	public void setIdDetallePremio(Integer idDetallePremio) {
		this.idDetallePremio = idDetallePremio;
	}

	

}