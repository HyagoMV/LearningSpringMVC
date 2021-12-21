package com.github.hyagomv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.hyagomv.application.FuncionarioSerive;
import com.github.hyagomv.model.dto.FuncionarioDto;
import com.github.hyagomv.model.persistence.FuncionarioEntity;
import com.github.hyagomv.model.persistence.FuncionarioEntityRepository;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioEntityRepository repository;
	
	@Autowired
	private FuncionarioSerive service;

	@GetMapping("/funcionario")
	public String funcionario(@RequestParam(name = "id", required = false) Long id, Model model) {
		if (id != null) {
			var entityOptional = repository.findById(id);
			var funcionarioOptional = entityOptional.map(FuncionarioDto::new);

			model.addAttribute("nome", funcionarioOptional.get());

			return "funcionario-show";
		} else {
			model.addAttribute("funcionario", new FuncionarioDto());

			return "funcionario-form";
		}
	}

	@PostMapping("/funcionario")
	public void register(@ModelAttribute FuncionarioDto dto) {
		service.registar(dto);
	}

}



