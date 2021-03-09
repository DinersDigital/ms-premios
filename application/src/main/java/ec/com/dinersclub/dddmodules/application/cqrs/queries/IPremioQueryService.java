package ec.com.dinersclub.dddmodules.application.cqrs.queries;

import java.util.List;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.PremioQuery;

public interface IPremioQueryService {
	
	List<PremioQuery> getPremios(int id);

}
