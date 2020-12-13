package com.javastart.abstractclass.salary;

public abstract class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract double getMonthSalary();

    public abstract double getYearSalary();

    public StringBuilder getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(surname);

        return sb;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " " + surname + " month salary: " + getMonthSalary() + " year salary: " + getYearSalary();
    }
}
