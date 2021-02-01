package com.javastart.revision.readfiles1;

import com.javastart.collections.maps.company.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.javastart.collections.maps.company.CompanyApp.createEmployee;

public class CompanyApp {
    private static Scanner sc = new Scanner(System.in);
    private static final String FILE_NAME = "Company.txt";

    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("Please enter 1 to add employee to file or 2 to read employees, 3 to exit");
            String options = sc.nextLine();
            option = Integer.parseInt(options);
            switch (option) {
                case (1): {
                    Employee newEmployee = createEmployee();
                    saveToFile(newEmployee);
                    break;
                }
                case (2): {
                    List<Employee> employees = readFile();
                    System.out.println(employees.toString());
                    break;
                }
                case (3): {
                    System.exit(0);
                    break;
                }
            }
        } while (option != 3);
    }

    private static void saveToFile(Employee newEmployee) {
        try (
                var bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            bufferedWriter.write(newEmployee.getName() + " " + newEmployee.getLastName() + " " + newEmployee.getSalary());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static List<Employee> readFile() {
        List<Employee> employeFromLine = new ArrayList<>();
        try (
                var bufferedReader = new BufferedReader(new FileReader(FILE_NAME))
        ) {
            String line = bufferedReader.lines()
                    .collect(Collectors.joining(System.lineSeparator()));
            employeFromLine = createEmployeeFromLine(line);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return employeFromLine;
    }

    private static List<Employee> createEmployeeFromLine(String line) {
        List<Employee> employees = new ArrayList<>();
        String[] splitByNewLine = line.split("\\r?\\n");
        for (String singleLine : splitByNewLine) {
            String[] split = singleLine.split(" ");
            employees.add(new Employee(split[0], split[1], Double.parseDouble(split[2])));
        }

        return employees;
    }
}
