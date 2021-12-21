package com.github.hyagomv.domain;

public class Funcionario {

	private String nome;

	public Funcionario() {

	}

	public Funcionario(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() < 20)
			throw new IllegalArgumentException("O nome do funcionário e muito pequeno");
		if (nome.length() > 80)
			throw new IllegalArgumentException("O nome do funcionário e muito grande");
		this.nome = nome;
	}

}
