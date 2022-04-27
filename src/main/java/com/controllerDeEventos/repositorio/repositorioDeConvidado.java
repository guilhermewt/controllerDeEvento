package com.controllerDeEventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controllerDeEventos.entities.Convidado;

@Repository
public interface repositorioDeConvidado extends JpaRepository<Convidado, Long>{
	
	Convidado findById(long id);
}
