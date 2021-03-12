package ec.com.dinersclub.dddmodules.infrastructure.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import ec.com.dinersclub.dddmodules.domain.model.DetallePremio;
import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.DetallePremioEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.PremioEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.TarjetaEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.DetallePremioRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.PremioRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.TarjetaRepository;

@ApplicationScoped
public class InfrastructureServiceImpl implements IRepository {

	@Inject
	TarjetaRepository tarjetaRepository;

	@Inject
	PremioRepository premioRepository;
	
	@Inject
	DetallePremioRepository detallePremioRepository;

	@Override
	public List<Tarjeta> getTarjetas() {
		List<Tarjeta> tarjetaList = new ArrayList<>();
		List<TarjetaEntity> tarjetaEntityList = tarjetaRepository.listAll();
		if (!tarjetaEntityList.isEmpty()) {
			return TarjetaEntity.map(tarjetaEntityList);
		} else {

			return tarjetaList;
		}
	}

	@Override
	public Tarjeta getTarjeta(UUID id) {
		TarjetaEntity tarjetaEntity = tarjetaRepository.findById(id);
		if (tarjetaEntity != null) {
			return tarjetaEntity.toTarjeta();
		} else {
			return null;
		}
	}

	@Override
	@Transactional
	public void createTarjeta(Tarjeta tarjeta) {
		TarjetaEntity.persist(new TarjetaEntity(tarjeta));
	}

	@Override
	@Transactional
	public void deleteTarjeta(UUID id) {
		TarjetaEntity.delete("id", id);
	}

	@Override
	@Transactional
	public void crearPremio(Premio premio) {
		System.out.println("entra a crear premio");
		String query = "idCliente = :idCliente and idCampania = :idCampania";
		Map<String, Object> params = new HashMap<>();
		params.put("idCliente", premio.getIdCliente());
		params.put("idCampania", premio.getIdCampania());

		List<PremioEntity> listPremioEntity =  premioRepository.findConsumoById(query, params);
		System.out.println(listPremioEntity.isEmpty());
		
		if (listPremioEntity.isEmpty()) {
			System.out.println("sin nada en base"+premio.getNombreCampania());
			PremioEntity premioEntity = new PremioEntity();
			premioEntity.setEstadoCampania(premio.getEstadoCampania());
			premioEntity.setEstadoPremio(premio.getEstadoPremio());
			premioEntity.setIdCampania(premio.getIdCampania());
			premioEntity.setIdCliente(premio.getIdCliente());
			premioEntity.setMontoTotalCampania(premio.getMontoTotalCampania());
			premioEntity.setNombreCampania(premio.getNombreCampania());
			premioEntity.setValorTotalConsumos(premio.getValorTotalConsumos());
			premioRepository.persist(premioEntity);
			
			if(premioRepository.isPersistent(premioEntity)){
				System.out.println(premioEntity);
				List<DetallePremioEntity> listDetallePremio = construirPremioDetalle(premio,premioEntity);
				listDetallePremio.stream().forEach(this::guardarPremioDetalle);
			}
			
			
		}else {
			System.out.println("con lista en base");
			listPremioEntity.stream().forEach(c -> {c.setEstadoCampania(premio.getEstadoCampania());
				c.setEstadoPremio(premio.getEstadoPremio());
				c.setIdCampania(premio.getIdCampania());
				c.setIdCliente(premio.getIdCliente());
				
				guardarPremio(c);
				List<DetallePremioEntity> listPremioDetalle = construirPremioDetalle(premio, c);
				listPremioDetalle.stream().forEach(this::guardarPremioDetalle);
			
			
			});

	}}

	@Override
	public List<Premio> getPremio(int id) {
		return null;
	}

	@Override
	@Transactional
	public void deletePremio(int id) {
		PremioEntity.delete("id", id);

	}
	
	private List<DetallePremioEntity> construirPremioDetalle(Premio Premio, PremioEntity pe) {

		List<DetallePremioEntity> listPremioDetalle = new ArrayList<>();
		Premio.getListDetallePremio().stream().forEach(p -> {
			DetallePremioEntity premioDetalle = new DetallePremioEntity();
			premioDetalle.getIdPremio();
			premioDetalle.setEstado(p.getEstado());
			premioDetalle.setMeta(p.getMeta());
			premioDetalle.setNombreRango(p.getNombreRango());
			premioDetalle.setValorPremio(p.getValorPremio());
			premioDetalle.setIdPremio(pe.getIdPremio());
			premioDetalle.setIdCliente(Premio.getIdCliente());
			listPremioDetalle.add(premioDetalle);

		});
		return listPremioDetalle;
	}
	
	@Transactional
	private void guardarPremioDetalle(DetallePremioEntity pd) {
		detallePremioRepository.persist(pd);
	}
	
	@Transactional
	private void guardarPremio(PremioEntity pe) {
		premioRepository.persist(pe);
	}


}
