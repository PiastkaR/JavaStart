package com.javastart.methodreferences.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Company {
    public static void main(String[] args) {
        List<Employee> employees = createEmployees();
        //10% podwyżki dla pracowników zatrudnionych na pełen etat
        addBonusToFullTimeEmployees(employees);

        //liczba pracowników etatowych
        double fullTimeEmployeesNumber = countEmployeesByEmployment(employees);

        System.out.println("Liczba pracowników zatrudnionych na pełen etat: " + fullTimeEmployeesNumber);
        System.out.println("Oto oni:");
        employees.stream().filter(Company::fullTime)
                .forEach(System.out::println);

        employeeWithLongestName(employees)
                .ifPresent(Company::accept);
    }

    private static Optional<String> employeeWithLongestName(List<Employee> employees) {
        return employees.stream()
                .map(Company::apply)
                .max(Comparator.comparingInt(String::length));
    }

    private static long countEmployeesByEmployment(List<Employee> employees) {
        return employees.stream()
                .filter(Company::checkEmployment)
                .count();
    }

    private static void addBonusToFullTimeEmployees(List<Employee> employees) {
        employees.stream()
                .filter(Company::fullTime)
                .forEach(Company::setSalary);
    }

    private static void setSalary(Employee employee) {
        employee.setSalary(employee.getSalary() * 1.1);
    }

    private static List<Employee> createEmployees() {
        return List.of(
                new Employee("Jan", "Kowalski", 4000, Employment.FULL_TIME),
                new Employee("Marta", "Baczewska", 3900, Employment.FULL_TIME),
                new Employee("Karol", "Piotrowicz", 5800, Employment.CONTRACT),
                new Employee("Anna", "Lubicz", 6000, Employment.PART_TIME),
                new Employee("Wojciech", "Kozłowski", 3500, Employment.PART_TIME),
                new Employee("Paweł", "Kowalski", 8000, Employment.FULL_TIME),
                new Employee("Adam", "Marchwicki", 300, Employment.CONTRACT)
        );
    }

    private static boolean checkEmployment(Employee employee) {
        return employee.getEmployment().equals(Employment.FULL_TIME);
    }

    private static String apply(Employee employee) {
        return employee.getFirstName() + " " + employee.getLastName();
    }

    private static void accept(String emp) {
        System.out.println("Pracownik o najdłuższym imieniu i nazwisku to " + emp);
    }

    private static boolean fullTime(Employee employee) {
        return employee.getEmployment() == Employment.FULL_TIME;
    }
}