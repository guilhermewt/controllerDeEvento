package com.controllerDeEventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controllerDeEventos.entities.Evento;

@Repository
public interface repositorioDeEventos extends JpaRepository<Evento, String>{
	
	Evento findById(long id);
}
