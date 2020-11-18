package com.javastart.loops.hospital;

import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != exit) {
            System.out.println("Options: ");
            System.out.println("0 - exit");
            System.out.println("1 - add patient");
            System.out.println("2 - print patients");

            System.out.println("Choose option: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case (addPatient):
                    Patient patient = new Patient();
                    System.out.println("Name: ");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Last name: ");
                    patient.setLastName(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case (printPatients):
                    hospital.printPatients();
                    break;
                case exit:
                    System.out.println("Zamykam program!");
                default:
                    System.out.println("There is no such an option");
            }
        }
        input.close();
    }
}
