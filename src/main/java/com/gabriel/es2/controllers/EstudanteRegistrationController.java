package com.gabriel.es2.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gabriel.es2.beans.*;

@RestController
public class EstudanteRegistrationController {
	@Autowired
	private EstudanteRegistration studentRegistration;

	@PostMapping("/estudante")
	public Estudante registerStudent(@RequestBody Estudante student) {
		studentRegistration.save(student);
		return student;
	}

}
