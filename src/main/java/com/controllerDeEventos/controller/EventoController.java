package com.controllerDeEventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.controllerDeEventos.entities.Convidado;
import com.controllerDeEventos.entities.Evento;
import com.controllerDeEventos.services.ServiceConvidado;
import com.controllerDeEventos.services.ServiceEvento;

@Controller
public class EventoController {
	
	@Autowired
	private ServiceEvento service;
	
	@Autowired
	private ServiceConvidado serviceConvidado;
	
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
	@RequestMapping(value="/eventos", method = RequestMethod.GET)
	public ModelAndView listaDeEventos() {
		ModelAndView mv = new ModelAndView("index");
		List<Evento> allEventos = service.findAll();
		mv.addObject("eventos", allEventos);
		return mv;
		
	}
	
	@RequestMapping(value="/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") long id) {
		Evento evento = service.findByEvento(id);
		ModelAndView mv = new ModelAndView("evento/detalhesEvento");
		mv.addObject("evento", evento);
		return mv;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.POST)
	public String salvarConvidado(@PathVariable("id") long id, Convidado convidado) {
		Evento evento = service.findByEvento(id);
		convidado.setEventos(evento);
		serviceConvidado.insert(convidado);
		return "redirect:/{id}";
	}
	
	
	
}
