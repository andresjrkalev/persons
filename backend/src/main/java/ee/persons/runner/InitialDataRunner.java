package ee.persons.runner;

import com.github.vladislavgoltjajev.isikukood.EstonianId;
import ee.persons.model.Person;
import ee.persons.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;

import static ee.persons.common.Constants.*;

@Component
public class InitialDataRunner implements CommandLineRunner {
    private final PersonService personService;
    private final Random random = new Random();

    public InitialDataRunner(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i < MAX_PERSONS; i++) {
            Person person = createPerson();
            personService.create(person);
        }
    }

    private Person createPerson() {
        String firstname = findArrayRandomValue(FIRSTNAMES);
        String lastname = findArrayRandomValue(LASTNAMES);
        String personalCode = EstonianId.generateRandomPersonalCode();
        return new Person(firstname, lastname, personalCode);
    }

    private String findArrayRandomValue(String[] array) {
        int index = random.nextInt(array.length);
        return array[index];
    }
}
