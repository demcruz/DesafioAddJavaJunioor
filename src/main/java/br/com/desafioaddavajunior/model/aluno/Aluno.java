package br.com.desafioaddavajunior.model.aluno;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import br.com.desafioaddavajunior.model.turma.Turma;

public class Aluno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3882799918379899119L;

	private Integer id;

	private String nome;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private LocalDate dataDeNascimento;

	private Turma turma;

	public Aluno(int id, String nome, LocalDate dataDeNascimento, Turma turma) {
		this.id = id;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.turma = turma;
	}

	public void exibirAlunos() {
		System.out.println(getId() + getNome() + getDataDeNascimento() + getTurma());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
