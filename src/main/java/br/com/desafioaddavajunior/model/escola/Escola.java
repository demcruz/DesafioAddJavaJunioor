package br.com.desafioaddavajunior.model.escola;

public class Escola {

	private Integer id;
	private String Nome;
	private Endereco endereco;

	public Escola(Integer id, String nome, Endereco endereco) {
		this.id = id;
		Nome = nome;
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
