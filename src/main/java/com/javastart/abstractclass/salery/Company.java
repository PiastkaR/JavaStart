package com.javastart.abstractclass.salery;

public class Company {
    public double getMonthSalaryForAllEmployees(Employee[] employees) {
        double salary = 0;
        for (int i = 0; i < employees.length; i++) {
            double employeeSalary = employees[i].getMonthSalary();
            salary = salary + employeeSalary;
        }

        return salary;
    }

    public double getYearSalaryForAllEmployees(Employee[] employees) {
        double salary = 0;
        for (int i = 0; i < employees.length; i++) {
            double employeeSalary = employees[i].getYearSalary();
            salary = salary + employeeSalary;
        }

        return salary;
    }

    public Employee[] createEmployees() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Jan", "Kowalski", 5000);
        employees[1] = new PartTimeEmployee("Anna", "Borowska", 10, 80);
        return employees;
    }

    public void printEmployees(Employee[] employees) {
        System.out.println("Employees: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
