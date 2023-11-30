package ee.persons.service;

import ee.persons.model.Person;
import ee.persons.repository.PersonRepository;
import ee.persons.specification.PersonSpecification;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

import static ee.persons.common.Constants.LIMIT_PERSON;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void create(Person person) {
        personRepository.save(person);
    }

    public List<Person> findBy(String firstname, String lastname, String personalCode) {
        Specification<Person> specification = Specification.where(PersonSpecification.findByFirstnameOrLastnameOrPersonalCode(firstname, lastname, personalCode));
        Pageable pageable = Pageable.ofSize(LIMIT_PERSON);
        return personRepository.findAll(specification, pageable).stream().toList();
    }
}
