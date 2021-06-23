package br.com.loose_m.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loose_m.personapi.dto.PersonDTO;
import br.com.loose_m.personapi.entity.Person;
import br.com.loose_m.personapi.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;

	public PersonDTO createdPerson(Person person) {
		Person savedPerson = repository.save(person);
		return PersonDTO.builder().message("Created Person With Id" + savedPerson.getId()).build();
	}
}
