package ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "premio")
public class PremioEntity extends PanacheEntityBase {

	@Id
	@GeneratedValue
	private Integer id;
	private Integer idCliente;
	private Integer idCampania;
	private String nombreCampania;
	private Double montoTotalCampania;
	private String estadoCampania;
	private Double valorTotalConsumos;
	
	
	@OneToMany(mappedBy = "premioEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<DetallePremioEntity> listDetallePremioEntity= new ArrayList<>();

	public PremioEntity() {

	}
	
	

	public PremioEntity(Integer idCliente, Integer idCampania, String nombreCampania, Double montoTotalCampania,
			String estadoCampania, Double valorTotalConsumos, List<DetallePremioEntity> listDetallePremioEntity) {
		super();
		this.idCliente = idCliente;
		this.idCampania = idCampania;
		this.nombreCampania = nombreCampania;
		this.montoTotalCampania = montoTotalCampania;
		this.estadoCampania = estadoCampania;
		this.valorTotalConsumos = valorTotalConsumos;
		this.listDetallePremioEntity = listDetallePremioEntity;
	}

	public PremioEntity(Premio premio) {

		this.idCliente = premio.getIdCliente();
		this.idCampania = premio.getIdCampania();
		this.nombreCampania = premio.getNombreCampania();
		this.montoTotalCampania = premio.getMontoTotalCampania();
		this.estadoCampania = premio.getEstadoCampania();
		this.valorTotalConsumos = premio.getValorTotalConsumos();
		this.listDetallePremioEntity = premio.getListDetallePremio().stream().map(m -> new DetallePremioEntity(m.getId(), m.getMeta() , m.getNombreRango(), m.getValorPremio())).collect(Collectors.toList());
	}

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

	public List<DetallePremioEntity> getListDetallePremioEntity() {
		return listDetallePremioEntity;
	}

	public void setListDetallePremioEntity(List<DetallePremioEntity> listDetallePremioEntity) {
		this.listDetallePremioEntity = listDetallePremioEntity;
	}

	public Integer getId() {
		return id;
	}

}