package ee.persons.specification;

import ee.persons.model.Person;
import ee.persons.utility.QueryUtility;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

import static ch.qos.logback.core.util.OptionHelper.isNullOrEmpty;
import static ee.persons.common.Constants.*;

public interface PersonSpecification {
    static Specification<Person> findByFirstnameOrLastnameOrPersonalCode(String firstname, String lastname, String personalCode) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (!isNullOrEmpty(firstname)) {
                predicates.add(criteriaBuilder.like(root.get(PROPERTY_FIRSTNAME), QueryUtility.createLike(firstname)));
            }

            if (!isNullOrEmpty(lastname)) {
                predicates.add(criteriaBuilder.like(root.get(PROPERTY_LASTNAME), QueryUtility.createLike(lastname)));
            }

            if (!isNullOrEmpty(personalCode)) {
                predicates.add(criteriaBuilder.like(root.get(PROPERTY_PERSONAL_CODE), QueryUtility.createLike(personalCode)));
            }
            return criteriaBuilder.or(predicates.toArray(new Predicate[0]));
        };
    }
}
