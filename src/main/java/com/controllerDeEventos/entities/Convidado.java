package com.controllerDeEventos.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_convidado")
public class Convidado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	@Id
	private long rg;
	
	@ManyToOne
	private Evento eventos;
	
	public Convidado() {
	}

	public Convidado(String nome, long rg) {
		super();
		
		this.nome = nome;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public Evento getEventos() {
		return eventos;
	}

	public void setEventos(Evento eventos) {
		this.eventos = eventos;
	}
	
	
	
}
