package com.javastart.serialization.company;

import java.io.Serializable;

public class Company implements Serializable {
    public static final int MAX_EMPLOYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPLOYEES];
    private int iterator = 0;

    public void addEmployee(Employee employee) {
        if (employees.length <= MAX_EMPLOYEES) {
            employees[iterator] = employee;
            iterator++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Company is full.");
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
