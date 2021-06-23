package br.com.loose_m.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.loose_m.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
