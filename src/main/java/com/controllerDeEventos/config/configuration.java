package com.controllerDeEventos.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.controllerDeEventos.entities.Evento;
import com.controllerDeEventos.repositorio.repositorioDeEventos;

@Configuration
public class configuration implements CommandLineRunner {

	@Autowired
	private repositorioDeEventos repositorio;

	@Override
	public void run(String... args) throws Exception {
		   Evento e1 = new Evento(0l,"Djavan em Brasília" , "Brasília - DF", "19:00", "23/04/2022"); 
		   Evento e2 = new Evento(0l, "TEATRO – PINÓQUIO", "Parque Nacional de Brasilia", "20:00", "26/04/2022"); 
		   Evento e3 = new Evento(0l,"Concurso Drink do Cerrado" , "St. de Clubes Esportivos Su", "17:00", "01/04/2022"); 
		   Evento e4 = new Evento(0l,"SEMINÁRIO DE FINANÇAS 2022" , "Teatro da Caesb", "20:00", "21/04/2022");
		   
		   repositorio.saveAll(Arrays.asList(e1,e2,e3,e4));
		
	}

}
