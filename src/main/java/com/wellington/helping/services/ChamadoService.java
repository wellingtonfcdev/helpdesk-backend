package com.wellington.helping.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.helping.domain.Chamado;
import com.wellington.helping.domain.Cliente;
import com.wellington.helping.domain.Tecnico;
import com.wellington.helping.domain.dtos.ChamadoDTO;
import com.wellington.helping.domain.enums.Prioridade;
import com.wellington.helping.domain.enums.Status;
import com.wellington.helping.repositories.ChamadoRepository;
import com.wellington.helping.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;//faz a comunicação com o banco
	
	@Autowired
	private TecnicoService tecnicoService;
	
	@Autowired
	private ClienteService clienteService;
	
	//retorna um chamado
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado! ID: " + id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
		}

	public Chamado create(@Valid ChamadoDTO objDTO) {
		return repository.save(newChamado(objDTO));
	}
	
	public Chamado update(Integer id, @Valid ChamadoDTO objDTO) {
		objDTO.setId(id);
		Chamado oldObj = findById(id);
		oldObj = newChamado(objDTO);
		return repository.save(oldObj);
	}
	
	private Chamado newChamado(ChamadoDTO obj) {
		Tecnico tecnico = tecnicoService.findById(obj.getTecnico());
		Cliente cliente = clienteService.findById(obj.getCliente());
		
		Chamado chamado = new Chamado();
		if(obj.getId() != null) {
			chamado.setId(obj.getId());
		}
		
		chamado.setTecnico(tecnico);
		chamado.setCliente(cliente);
		chamado.setPrioridade(Prioridade.toEnum(obj.getPrioridade()));
		chamado.setStatus(Status.toEnum(obj.getStatus()));
		chamado.setTitulo(obj.getTitulo());
		chamado.setObservacoes(obj.getObservacoes());
		return chamado;
	}

	
}
