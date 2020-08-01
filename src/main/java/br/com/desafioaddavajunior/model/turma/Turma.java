package br.com.desafioaddavajunior.model.turma;

import java.io.Serializable;

import br.com.desafioaddavajunior.model.escola.Escola;

public class Turma implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5346973964742874761L;

	private Integer id;
	
	private String nome;
	
	private Integer capacidade;
	
	private Escola escola;
	
	
	

	public Turma(Integer id, String nome, Integer capacidade, Escola escola) {
	
		this.id = id;
		this.nome = nome;
		this.capacidade = capacidade;
		this.escola = escola;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	
	
	
	

}
