package com.controllerDeEventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.controllerDeEventos.entities.Evento;
import com.controllerDeEventos.services.ServiceEvento;

@Controller
public class EventoController {
	
	@Autowired
	private ServiceEvento service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
	public String carregaFormulario() {
		return "evento/formEvento";
	}
	
	@RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
	public String salvarFormulario(Evento evento) {
		service.insert(evento);
		return "redirect:/cadastrarEvento";
	}
}
