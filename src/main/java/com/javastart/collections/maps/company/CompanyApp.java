package com.javastart.collections.maps.company;

import java.util.HashMap;
import java.util.Scanner;

public class CompanyApp {
    private static final String ADD = "add";
    private static final String SEARCH = "search";
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);
    private static Company company = new Company();

    public static void main(String[] args) {
        businessLogic();
    }

    private static void businessLogic() {
        String option;

        do {
            readOption();
            option = chooseOption();

            switch (option) {
                case (ADD):
                    Employee employee = createEmployee();
                    addEmployee(employee);
                    break;
                case (SEARCH):
                    Employee search = searchEmployee();
                    System.out.println("Your searched employee is: " + search.toString());
                    break;
                case (EXIT):
                    System.out.println("Exiting the program...");
                    break;
            }
        } while (!option.equals(EXIT));
    }

    private static Employee searchEmployee() {
        System.out.println("Please enter the name and last name of searched person: ");
        String line = sc.nextLine();
        HashMap<String, Employee> companyDb = company.getCompanyDb();
        return companyDb.get(line);
    }

    private static void addEmployee(Employee employee) {
        HashMap<String, Employee> companyDb = company.getCompanyDb();
        StringBuilder sb = new StringBuilder();
        sb.append(employee.getName());
        sb.append(" ");
        sb.append(employee.getLastName());

        companyDb.put(sb.toString(), employee);
    }

    public static Employee createEmployee() {
        System.out.println("Please type name: ");
        String name = sc.nextLine();
        System.out.println("Please type lastName: ");
        String lastName = sc.nextLine();
        System.out.println("Please type salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        return new Employee(name, lastName, salary);
    }


    private static String chooseOption() {
        return sc.nextLine();
    }

    private static void readOption() {
        System.out.println("Please choose option: " + ADD + " " + SEARCH + " " + EXIT);
    }
}
