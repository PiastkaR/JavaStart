package com.javastart.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class PersonDatabase {
    private final List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null)
            throw new NullPointerException("Cannot add null reference");
        findById(person.getId())
                .ifPresent(p -> {
                    throw new IllegalArgumentException("Object with such id already exists");
                });
//        Optional.ofNullable(person).ifPresentOrElse(
//                p -> findById(p.getId())
//                        .ifPresent(p2 -> {
//                            throw new IllegalArgumentException("Object with such id already exists");
//                        }),
//                () -> {
//                    throw new NullPointerException("Cannot add null reference");
//                }
//);
    }

    public Optional<Person> findById(int id) {
        for (Person person : people) {
            if (person.getId() == id)
                return Optional.of(person);
        }
        return Optional.empty();
    }

    String findLastnameById(int id) {
        return findById(id)  //Optional<Person>
                .map(Person::getLastName) //Optional<String>
                .orElse("Anonim"); // zwroc last naem albo anonim
    }
}