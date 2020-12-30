package com.javastart.serialization.company;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String fileName = "employees.info";
        runProgram(scanner, fileName);

        System.out.println("Closing program.");
        scanner.close();
    }

    private static void runProgram(Scanner scanner, String fileName) throws IOException, ClassNotFoundException {
        System.out.println("Do you want override data from input file? y/n");
        String overrideData = scanner.nextLine();
        switch (overrideData) {
            case ("n"):
                Company company1 = readLocalFile(fileName);
                System.out.println(company1);
                break;
            case ("y"):
                Company company2 = writeDataFromUser(scanner);
                writeToFile(company2, fileName);
                break;
            default:
                throw new NoSuchElementException();
        }
    }

    private static void writeToFile(Company company, String fileName) {
        try (
                var fileOutStream = new FileOutputStream(fileName);
                var objectOutputStream = new ObjectOutputStream(fileOutStream);
        ) {
            objectOutputStream.writeObject(company);
            System.out.println("Saved:" + company.toString() + " to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Write file error!");
        }
    }

    private static Company readLocalFile(String fileName) throws IOException, ClassNotFoundException {
        try (
                var fileInputStream = new FileInputStream(fileName);
                var objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            return (Company) objectInputStream.readObject();
        }
    }

    private static Company writeDataFromUser(Scanner scanner) {
        Company company = new Company();
        for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter salary:");
            int salary = scanner.nextInt();
            scanner.nextLine();
            company.addEmployee(new Employee(firstName, lastName, salary));
        }
        return company;
    }
}