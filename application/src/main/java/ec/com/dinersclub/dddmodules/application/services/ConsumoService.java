package ec.com.dinersclub.dddmodules.application.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import ec.com.dinersclub.dddmodules.application.cqrs.queries.dto.ConsumoQuery;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosGrpc;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosRequest;
import ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse;
import ec.com.dinersclub.dddmodules.domain.model.DetallePremio;
import ec.com.dinersclub.dddmodules.domain.model.Premio;
import ec.com.dinersclub.dddmodules.domain.repository.IRepository;
import io.quarkus.grpc.runtime.annotations.GrpcService;

@ApplicationScoped 
public class ConsumoService {
	
	@Inject
	IRepository premioRepository;

	@Inject     
	@GrpcService("consumosRegistrados")     
	ConsumosRegistradosGrpc.ConsumosRegistradosBlockingStub clienteConsumo;

	public List<ConsumoQuery> createPremioCommand(Integer idCliente) {
		List<ConsumoQuery> listaConsumoQuery = new ArrayList<>();
		
		
		listaConsumoQuery = verificarConsumosCliente(idCliente);
		
		for (ConsumoQuery consumo : listaConsumoQuery ) {
			
			premioRepository.crearPremio(new Premio(consumo.getIdCliente(), consumo.getIdCampania(), consumo.getNombreCampania(), consumo.getMontoTotalCampania(), consumo.getEstadoCampania(),consumo.getValorTotalConsumos(), consumo.getListDetallePremio()));
		}
		return listaConsumoQuery;
		

	}
	
	public List<ConsumoQuery>  verificarConsumosCliente(Integer idCliente) {
		ConsumosRegistradosResponse listConsumosResponse = clienteConsumo.verificarConsumosRegistradosCliente(ConsumosRegistradosRequest.newBuilder().setIdCliente(idCliente).build());
		
		List<ConsumosRegistradosCampania> lista = listConsumosResponse.getConsumosRegistradosCampaniaList();
		
		return lista.stream().map(m -> new ConsumoQuery(m.getIdCliente(),m.getIdCampania(), m.getNombreCampania(),m.getMontoTotalCampania(), m.getEstado(), m.getValorTotalConsumoCliente(), 
				obtenerListaPremiosAcumulados(m))).collect(Collectors.toList());
				
	}

	private List<DetallePremio> obtenerListaPremiosAcumulados(ConsumosRegistradosCampania m) {
		return m.getPremiosPorAcreditarList().stream().map(p  -> new DetallePremio(p.getMeta(), p.getNombreRango(), p.getValorPremio())).collect(Collectors.toList());
	}

}
