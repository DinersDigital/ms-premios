package ec.com.dinersclub.dddmodules.domain.repository;

import java.util.List;
import java.util.UUID;

import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;

public interface IRepository {
	
	List<Tarjeta> getTarjetas();
	
    Tarjeta getTarjeta(UUID id);

    void createTarjeta(Tarjeta tarjeta);
    
    void deleteTarjeta(UUID id);
    
    void crearPremio(Premio premio);
    
    List<Premio> getPremio();
    
    void deletePremio(String id);

}