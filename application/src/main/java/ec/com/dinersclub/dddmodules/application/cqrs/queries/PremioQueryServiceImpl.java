package ec.com.dinersclub.dddmodules.application.cqrs.queries;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.PremioQuery;
import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.TarjetaQuery;
import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.model.Tarjeta;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;

@ApplicationScoped
public class PremioQueryServiceImpl implements IPremioQueryService{
	
	@Inject
	IRepository repository;
	
    public List<PremioQuery> map(List<Premio> premios) {
    	List<PremioQuery> premioList = new ArrayList<>();
        if (premios.isEmpty()) {
            return premioList;
        }

        List<PremioQuery> list = new ArrayList<>(premios.size());
        for (Premio premio : premios) {
            list.add(entityToDto(premio));
        }

        return list;
    }

    protected PremioQuery entityToDto(Premio premio) {
        if (premio == null) {
            return null;
        }
        return new PremioQuery(premio.getIdCliente(), premio.getIdCampania(), premio.getNombreCampania(),premio.getMontoTotalCampania(),premio.getEstadoCampania(),premio.getValorTotalConsumos(),premio.getListDetallePremio());
    }

	@Override
	public List<PremioQuery> getPremios(int id) {
		return map(repository.getPremio(id));
	}

}
