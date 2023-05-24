//
//  Comentário no pod
//

package com.gabriel.es2.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gabriel.es2.beans.Disciplina;
import com.gabriel.es2.beans.DisciplinaRegistration;

@RestController
public class DisciplinaRetrieveController {
	@Autowired
	private DisciplinaRegistration disciplinaRegistration;

	@GetMapping("/disciplina")
	public List<Disciplina> getAllDisciplinas() {
		Iterable<Disciplina> disciplinas = disciplinaRegistration.findAll();
		return (List<Disciplina>) disciplinas;
	}

}
