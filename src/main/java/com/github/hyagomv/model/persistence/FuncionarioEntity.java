package com.github.hyagomv.model.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.github.hyagomv.model.Funcionario;

@Entity
@Table(name = "funcionario")
public class FuncionarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100, nullable = false)
	private String nome;

	
	public FuncionarioEntity() {
		
	}
	
	public FuncionarioEntity(String nome) {
		this.nome = nome;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
