package com.javastart.optional;

import java.util.Optional;

class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> optionalPerson1 = db.findById(2); // Karol Zawadzki
        optionalPerson1.ifPresent(PersonTest::printLastName);

        Optional<Person> optionalPerson2 = db.findById(55); // null
//        if (optionalPerson2.isPresent()){
//            Person person = optionalPerson2.get();
//            System.out.println(person.getLastName());
//        } else
//            System.out.println("No person with id 55");

        optionalPerson2.ifPresentOrElse(
                person -> System.out.println(person.getLastName()),
                () -> System.out.println("No object with this id")
        );

        String lastnameById = db.findLastnameById(2);
        System.out.println(lastnameById);
    }

    private static void printLastName(Person person) {
        System.out.println(person.getLastName());
    }
}