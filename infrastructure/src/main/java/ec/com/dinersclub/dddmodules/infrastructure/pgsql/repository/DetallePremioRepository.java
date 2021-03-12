package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.DetallePremioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class DetallePremioRepository implements PanacheRepository<DetallePremioEntity> {
	
	public List<DetallePremioEntity> findDetallePremioById(String query, Map<String, Object> parameters) {
		try {
			return list(query, parameters);
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}
	
	   
}
