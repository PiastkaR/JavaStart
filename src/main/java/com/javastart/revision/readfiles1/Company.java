package com.javastart.revision.readfiles1;

import com.javastart.collections.maps.company.Employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Company implements Serializable {
    public static List<Employee> employees = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (com.javastart.collections.maps.company.Employee employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    public List<com.javastart.collections.maps.company.Employee> getEmployees() {
        return employees;
    }
}