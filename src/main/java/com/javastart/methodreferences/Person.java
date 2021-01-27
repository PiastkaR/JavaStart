package com.javastart.methodreferences;

import java.util.Random;

class Person {
    //TODO tu dajemy tatic zeby bylo tylko po 1 tablicy
//    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
//    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
//    private static int[] ages = {22, 33, 44, 55};
    private static Random random = new Random();

    // () -> Person dziala na supplierze! to dla konstruktora domyslnego...

    //(String[] a, String[] b, Integer[] c) -> Person musze sam zdefuniowac interfejs dla funkcji z 3 zmiennymi!

    public Person() {
    }

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Person(String[] firstNames, String[] lastNames, int[] ages) {
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}