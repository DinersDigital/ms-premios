package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.PremioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PremioRepository implements PanacheRepository<PremioEntity> {
	
	public PremioEntity findById(int id){
		return find("id", id).firstResult();
	}
	   
}
