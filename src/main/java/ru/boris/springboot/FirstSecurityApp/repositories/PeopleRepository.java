package ru.boris.springboot.FirstSecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.boris.springboot.FirstSecurityApp.models.Person;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);
}
