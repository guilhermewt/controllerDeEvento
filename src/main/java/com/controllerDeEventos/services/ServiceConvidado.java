package com.controllerDeEventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controllerDeEventos.entities.Convidado;
import com.controllerDeEventos.repositorio.repositorioDeConvidado;

@Service
public class ServiceConvidado {
	
	@Autowired
	private repositorioDeConvidado repositorio;
	
	public Convidado insert(Convidado obj) {
		return repositorio.save(obj);
	}
	
	public List<Convidado> findAll(){
		List<Convidado> listConvidado = repositorio.findAll();
		return listConvidado;
	}
	
	public Convidado findByConvidado(long id) {
		return repositorio.findById(id);
	}
	
}
