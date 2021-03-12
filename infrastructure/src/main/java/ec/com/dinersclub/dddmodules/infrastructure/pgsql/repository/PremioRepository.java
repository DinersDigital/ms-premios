package ec.com.dinersclub.dddmodules.infrastructure.pgsql.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.PremioEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PremioRepository implements PanacheRepository<PremioEntity> {
	
	public PremioEntity findById(int id){
		return find("id", id).firstResult();
	}
	
	public PremioEntity findByClienteId(int id){
		PremioEntity premioEntity = new PremioEntity();
		System.out.println("entra a buscar");
		try {
			System.out.println("antes");
			return find("idCliente", id).firstResult();
			
		} catch (Exception e) {
			System.out.println("catch");
			return premioEntity;
		}
		
	}
	
	
	public  List<PremioEntity> findConsumoById(String query, Map<String, Object> parameters) {
		try{
			return list(query, parameters);
		}catch(Exception e){
			return new ArrayList<>();
		}
	}
	
	   
}
