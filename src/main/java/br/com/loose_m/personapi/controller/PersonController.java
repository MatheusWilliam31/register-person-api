package br.com.loose_m.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.loose_m.personapi.entity.Person;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {

	@GetMapping
	public String getPerson() {
		Person person = new Person();
		person.getId();
		return "API Test!!!";
	}
}
