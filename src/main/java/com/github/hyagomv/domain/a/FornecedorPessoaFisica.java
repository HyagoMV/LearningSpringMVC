package com.github.hyagomv.domain.a;

import java.time.LocalDate;

public class FornecedorPessoaFisica extends Fornecedor {
	private Nome nome;
	private CadastroPessoasFisicas cpf;
	private Rg rg;

	private Sexo sexo;
	private LocalDate dataNascimento;
	private Estado estadoNatal;
	private Cidade cidadeNatal;
	private Pais paisNatal;

	private Nome nomeMae;
	private Nome nomePai;
	private EstadoCivil estadoCivil;

	private String observacoes;
}
