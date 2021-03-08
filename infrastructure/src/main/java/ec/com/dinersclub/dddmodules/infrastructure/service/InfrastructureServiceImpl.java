package ec.com.dinersclub.dddmodules.infrastructure.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.PremioEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.TarjetaEntity;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.PremioRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository.TarjetaRepository;

@ApplicationScoped
public class InfrastructureServiceImpl implements IRepository {
	
	@Inject
	TarjetaRepository tarjetaRepository;
	
	@Inject
	PremioRepository premioRepository;
	
	@Override
	public List<Tarjeta> getTarjetas() {
		List<Tarjeta> tarjetaList = new ArrayList<>();
		List<TarjetaEntity> tarjetaEntityList = tarjetaRepository.listAll();
		if (!tarjetaEntityList.isEmpty()) {
			return TarjetaEntity
					.map(tarjetaEntityList);
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
		PremioEntity.persist(new PremioEntity(premio));
		
	}

	@Override
	public List<Premio> getPremio() {
		List<Premio> premioList = new ArrayList<>();
		List<PremioEntity> premioEntityList = premioRepository.listAll();
		if (!premioEntityList.isEmpty()) {
			return PremioEntity.map(premioEntityList);
		} else {
			 
            return premioList;
        }
	}

	@Override
	public void deletePremio(String id) {
		PremioEntity.delete("id", id);
		
	}

}
