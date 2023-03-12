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
		Tecnico tec2 = new Tecnico(null, "Rafael Davi Fogaça", "45978762600", "rafael_davi_fogaca@maggitoyota.com.br", "123");
		Tecnico tec3 = new Tecnico(null, "Agatha Milena Eliane Almada", "89444361004", "agatha_almada@p4ed.com", "123");
		Tecnico tec4 = new Tecnico(null, "Juan Sebastião Geraldo Vieira", "47428723043", "juan_vieira@mirafactoring.com.br", "123");
		Tecnico tec5 = new Tecnico(null, "Pedro Henrique Vitor Daniel Lopes", "53367222275", "pedro_henrique_lopes@alwan.com.br", "123");
		Tecnico tec6 = new Tecnico(null, "Nathan João Victor Ribeiro", "98148155194", "nathan_ribeiro@comprehense.com.br", "123");
		Tecnico tec7 = new Tecnico(null, "Stefany Lara Daiane Figueiredo", "15158905037", "stefany.lara.figueiredo@vpsa.com.br", "123");
		Tecnico tec8 = new Tecnico(null, "Ester Melissa Rocha", "76877135750", "ester_rocha@construtoraplaneta.com.br", "123");
		
		Cliente cli1 = new Cliente(null, "Sara Alana Mariana da Mata", "73842598009", "sara_damata@catsfeelings.com.br", "123");
		Cliente cli2 = new Cliente(null, "Pedro Henrique Leandro Paulo Oliveira", "33001305738", "pedro.henrique.oliveira@grupointegraambiental.com.br", "123");
		Cliente cli3 = new Cliente(null, "Emanuel Fábio Juan da Costa", "67928665808", "emanuel.fabio.dacosta@mucoucah.com.br", "123");
		Cliente cli4 = new Cliente(null, "Lorenzo Rodrigo Costa", "68188000507", "lorenzo.rodrigo.costa@franciscofilho.adv.br", "123");
		Cliente cli5 = new Cliente(null, "Miguel Fábio Lorenzo da Paz", "25590216761", "miguel_fabio_dapaz@abbott.com", "123");
		Cliente cli6 = new Cliente(null, "Matheus Ricardo Henrique Monteiro", "65600558414", "matheus-monteiro95@soelegancia.com.br", "123");
		Cliente cli7 = new Cliente(null, "Sarah Fátima Daniela Ribeiro", "46918855875", "sarah.fatima.ribeiro@marmorariauchoa.com", "123");
		Cliente cli8 = new Cliente(null, "Joaquim Lorenzo Mário Vieira", "54224753642", "joaquim-vieira89@carubelli.com.br", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 02", "Primeiro Chamado 2", tec2, cli2);
		Chamado c3 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 03", "Primeiro Chamado 3", tec3, cli3);
		Chamado c4 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 04", "Primeiro Chamado 4", tec4, cli4);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 05", "Primeiro Chamado 5", tec5, cli5);
		Chamado c6 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 06", "Primeiro Chamado 6", tec6, cli6);
		Chamado c7 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 07", "Primeiro Chamado 7", tec7, cli7);
		Chamado c8 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 08", "Primeiro Chamado 8", tec8, cli8);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1,tec2,tec3,tec4,tec5,tec6,tec7,tec8));
		clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5,cli6,cli7,cli8));
		chamadoRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8));
		
	}
}
