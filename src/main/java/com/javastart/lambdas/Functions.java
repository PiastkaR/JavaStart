
package com.javastart.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Functions {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random = new Random();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            Person randomPerson = new Person(firstName, lastName, age);
            people.add(randomPerson);
        }
        for (Person person : people) {
            System.out.println(person);
        }
    }
}