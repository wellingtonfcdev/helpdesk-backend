package com.wellington.helping.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.helping.domain.Chamado;
import com.wellington.helping.domain.Cliente;
import com.wellington.helping.domain.Tecnico;
import com.wellington.helping.domain.enums.Perfil;
import com.wellington.helping.domain.enums.Prioridade;
import com.wellington.helping.domain.enums.Status;
import com.wellington.helping.repositories.ChamadoRepository;
import com.wellington.helping.repositories.ClienteRepository;
import com.wellington.helping.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Hugo Nelson Arthur Fogaça", "10340604905", "hugo_fogaca@andressamelo.com.br", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Sara Alana Mariana da Mata", "73842598009", "sara_damata@catsfeelings.com.br", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}
}