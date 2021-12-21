package com.github.hyagomv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.hyagomv.model.dto.FuncionarioDto;
import com.github.hyagomv.model.persistence.FuncionarioEntityRepository;

@Controller
public class FuncionarioController {

	@Autowired
	private FuncionarioEntityRepository repository;

	@GetMapping("/funcionario")
	public String funcionario(@RequestParam(name = "id", required = true) Long id, Model model) {
		var entityOptional = repository.findById(id);
		var funcionarioOptional = entityOptional.map(FuncionarioDto::new);

		model.addAttribute("nome", funcionarioOptional.get());

		return "funcionario";
	}

}