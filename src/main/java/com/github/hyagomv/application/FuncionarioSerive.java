package com.github.hyagomv.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hyagomv.model.Funcionario;
import com.github.hyagomv.model.dto.FuncionarioDto;
import com.github.hyagomv.model.persistence.FuncionarioEntity;
import com.github.hyagomv.model.persistence.FuncionarioEntityRepository;

@Service
public class FuncionarioSerive {

	@Autowired
	private FuncionarioEntityRepository repository;

	public void registar(FuncionarioDto dto) {
		var entity = new FuncionarioEntity(new Funcionario(dto.getNome()));
		repository.save(entity);
	}

}
