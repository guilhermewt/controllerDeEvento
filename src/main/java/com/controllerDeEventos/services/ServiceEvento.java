package com.controllerDeEventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controllerDeEventos.entities.Evento;
import com.controllerDeEventos.repositorio.repositorioDeEventos;

@Service
public class ServiceEvento {
	
	@Autowired
	private repositorioDeEventos repositorio;
	
	public Evento insert(Evento obj) {
		return repositorio.save(obj);
	}
	
	public List<Evento> findAll(){
		List<Evento> listEvento = repositorio.findAll();
		return listEvento;
	}
	
	public Evento findByEvento(long id) {
		return repositorio.findById(id);
	}
	
}
