package com.javastart.polymorphyism.hospital;

public class Hospital {
    private static final int MAX_EMPLOYEES = 3;

    private Person[] employees = new Person[MAX_EMPLOYEES];
    private int employeesNumber = 0;

    public void add(Person person) {
        if (employeesNumber <= MAX_EMPLOYEES) {
            employees[employeesNumber] = person;
            employeesNumber++;
        }
    }

    public void getInfo() {
        for (Person person : employees) {
            System.out.println(person.getInfo());
        }
    }

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }
}
