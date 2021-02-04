package ru.alishev.springcourse.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

@Component
public class PersonDAO {

  private static int PEOPLE_COUNT;
  private List<Person> people;

  {
    people = new ArrayList<>();
    people.add(new Person(++PEOPLE_COUNT, "Alex"));
    people.add(new Person(++PEOPLE_COUNT, "Gloria"));
    people.add(new Person(++PEOPLE_COUNT, "Melvin"));
    people.add(new Person(++PEOPLE_COUNT, "Shkiper"));
  }

  public List<Person> index() {
    return people;
  }

  public Person show(int id) {
    return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);

  }
}
