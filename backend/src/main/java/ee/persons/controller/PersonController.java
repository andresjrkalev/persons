package ee.persons.controller;

import static ee.persons.common.Constants.ENDPOINT_PERSON;
import static ee.persons.common.Constants.QUERY_PARAMETER_PERSONAL_CODE;

import ee.persons.model.Person;
import ee.persons.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(ENDPOINT_PERSON)
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    @ResponseBody
    public List<Person> findBy(
            @RequestParam String firstname,
            @RequestParam String lastname,
            @RequestParam(value = QUERY_PARAMETER_PERSONAL_CODE) String personalCode
    ) {
        return personService.findBy(firstname, lastname, personalCode);
    }
}
