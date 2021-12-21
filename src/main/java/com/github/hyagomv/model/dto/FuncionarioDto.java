package com.github.hyagomv.model.dto;

import com.github.hyagomv.domain.Funcionario;
import com.github.hyagomv.model.persistence.FuncionarioEntity;

public class FuncionarioDto {

	private String nome;
	
	public FuncionarioDto() {

	}

	public FuncionarioDto(FuncionarioEntity entity) {
		this.nome = entity.getNome();
	}

	public Funcionario convertTo(FuncionarioEntity entity) {
		return new Funcionario(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + "]";
	}

}
