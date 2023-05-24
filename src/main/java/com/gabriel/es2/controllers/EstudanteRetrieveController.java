//
//  Comentário no pod
//

package com.gabriel.es2.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gabriel.es2.beans.Estudante;
import com.gabriel.es2.beans.EstudanteRegistration;

@RestController
public class EstudanteRetrieveController {
	@Autowired
	private EstudanteRegistration estudanteRegistration;

	@GetMapping("/estudante")
	public List<Estudante> getAllStudents(@RequestParam(value = "nome", required = false) String nome) {
		if (nome != null) {
			Iterable<Estudante> estudantes = estudanteRegistration.findByNomeContaining(nome);
			return (List<Estudante>) estudantes;
		}
		Iterable<Estudante> estudantes = estudanteRegistration.findAll();
		return (List<Estudante>) estudantes;
	}

	@GetMapping("/estudante/{matricula}")
	public Estudante getAllStudents(@PathVariable("matricula") Integer matricula) {
		Optional<Estudante> optionalEstudante = estudanteRegistration.findById(matricula);
		Estudante estudante = optionalEstudante.orElse(null);
		return estudante;
	}

}
