package com.javastart.serialization.company;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: " + salary + "zł";
    }
}
