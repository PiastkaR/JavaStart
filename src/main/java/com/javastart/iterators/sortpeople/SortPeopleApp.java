package com.javastart.iterators.sortpeople;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortPeopleApp {
    private static final Map<String, Person> people = new TreeMap<>();

    public static void main(String[] args) {
        addPeople();
        printPeople(people);
    }

    private static void printPeople(Map<String, Person> people) {
        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void addPeople() {
        Person person1 = new Person("Agata", "Zawadzka", 23);
        Person person2 = new Person("Rafal", "Piastka", 29);
        Person person3 = new Person("Lukasz", "Faflik", 29);
        Person person4 = new Person("Izabela", "Kaminska", 25);
        Person person5 = new Person("Agata", "Zagrodzka", 23);

        people.put(person1.getLastName(), person1);
        people.put(person2.getLastName(), person2);
        people.put(person3.getLastName(), person3);
        people.put(person4.getLastName(), person4);
        people.put(person5.getLastName(), person5);
    }
}
