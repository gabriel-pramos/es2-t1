package com.gabriel.es2.controllers;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.gabriel.es2.beans.EstudanteRegistration;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class EstudanteDeleteController {
	@Autowired
	private EstudanteRegistration studentRegistration;

	// @RequestMapping(method = RequestMethod.DELETE,
	// value="/delete/student/{regdNum}")
	//
	// @ResponseBody
	@DeleteMapping("/estudante/{regdNum}")
	public void deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
		studentRegistration.deleteById(Integer.parseInt(regdNum));
		return;
	}

}
