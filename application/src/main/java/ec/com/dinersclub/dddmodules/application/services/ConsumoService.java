package ec.com.dinersclub.dddmodules.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosGrpc;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse;
import ec.com.dinersclub.dddmodules.domain.model.DetallePremio;
import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;
import ec.com.dinersclub.dddmodules.infrastructure.pgsql.entities.DetallePremioEntity;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped 
public class ConsumoService {
	
	@Inject
	IRepository premioRepository;

	@Inject     
	@GrpcService("consumosRegistrados")     
	ConsumosRegistradosGrpc.ConsumosRegistradosBlockingStub clienteConsumo;

	public List<Premio> createPremioCommand(Integer idCliente) {
		List<Premio> listaConsumoQuery = new ArrayList<>();
		
		
		listaConsumoQuery = verificarConsumosCliente(idCliente);
		
		for (Premio premio : listaConsumoQuery ) {
			
			premioRepository.crearPremio(new Premio(premio.getIdCliente(), premio.getIdCampania(), premio.getNombreCampania(), premio.getMontoTotalCampania(), premio.getEstadoCampania(),premio.getValorTotalConsumos(), premio.getListDetallePremio(),premio.getEstadoPremio()));
		}
		return listaConsumoQuery;
		

	}
	
	public List<Premio>  verificarConsumosCliente(Integer idCliente) {
		ConsumosRegistradosResponse listConsumosResponse = clienteConsumo.verificarConsumosRegistradosCliente(ConsumosRegistradosRequest.newBuilder().setIdCliente(idCliente).build());
		
		List<ConsumosRegistradosCampania> lista = listConsumosResponse.getConsumosRegistradosCampaniaList();
		
		return lista.stream().map(m -> new Premio(m.getIdCliente(),m.getIdCampania(), m.getNombreCampania(),m.getMontoTotalCampania(), m.getEstado(), m.getValorTotalConsumoCliente(), 
				obtenerListaPremiosAcumulados(m))).collect(Collectors.toList());
				
	}

	private List<DetallePremio> obtenerListaPremiosAcumulados(ConsumosRegistradosCampania m) {
		return m.getPremiosPorAcreditarList().stream().map(p  -> new DetallePremio(p.getMeta(), p.getNombreRango(), p.getValorPremio())).collect(Collectors.toList());
	}
	

}
