package ee.persons.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String personalCode;

    public Person(String firstname, String lastname, String personalCode) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.personalCode = personalCode;
    }
}
