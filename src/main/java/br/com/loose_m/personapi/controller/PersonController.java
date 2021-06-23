package br.com.loose_m.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.loose_m.personapi.dto.PersonDTO;
import br.com.loose_m.personapi.entity.Person;
import br.com.loose_m.personapi.service.PersonService;

@RestController
@RequestMapping("people")
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PersonDTO createdPerson(@RequestBody Person person) {
		return service.createdPerson(person);
	}
}
