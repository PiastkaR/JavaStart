package com.javastart.revision.readfiles1;

import java.io.Serializable;

class Employee extends Person implements Serializable {
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", wypłata: " + salary + "zł";
    }
}