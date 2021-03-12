package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "premio")
public class PremioEntity extends PanacheEntityBase {

	@Id
	@SequenceGenerator(
	        name = "secuenciaPremio",
	        sequenceName = "pre_id_seq",
	        allocationSize = 1,
	        initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secuenciaPremio")
	@Column(name="idpremio", nullable=false, updatable =false)
	private Integer idPremio;
	private Integer idCliente;
	private Integer idCampania;
	private String nombreCampania;
	private Double montoTotalCampania;
	private String estadoCampania;
	private Double valorTotalConsumos;
	private String estadoPremio;
	
	@OneToMany(mappedBy = "premioEntity",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetallePremioEntity> listDetallePremioEntity;

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

	public String getEstadoPremio() {
		return estadoPremio;
	}

	public void setEstadoPremio(String estadoPremio) {
		this.estadoPremio = estadoPremio;
	}

	public Integer getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(Integer idPremio) {
		this.idPremio = idPremio;
	}

	public List<DetallePremioEntity> getListDetallePremioEntity() {
		return listDetallePremioEntity;
	}

	public void setListDetallePremioEntity(List<DetallePremioEntity> listDetallePremioEntity) {
		this.listDetallePremioEntity = listDetallePremioEntity;
	}


	
	

}