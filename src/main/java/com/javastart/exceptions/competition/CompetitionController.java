package com.javastart.exceptions.competition;

import java.util.InputMismatchException;
import java.util.Scanner;

class CompetitionController {
    private Scanner scanner = new Scanner(System.in);

    void run() {
        Competition competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private Competition createCompetition() {
        System.out.println("Competition Name:");
        String competitionName = scanner.nextLine();
        System.out.println("Max competitors No:");
        int maxParticipants = scanner.nextInt();
        System.out.println("Age limit:");
        int ageLimit = scanner.nextInt();
        scanner.nextLine();
        return new Competition(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(Competition competition) {
        while (competition.hasFreeSpots()) {
            System.out.println("Add new participant");
            Participant participant = createParticipant();
            try {
                competition.addParticipant(participant);
            } catch (AgeViolationException | DuplicateException | MaxCompetitorsException exception) {
                System.err.println(String.format("Error Occurred: '%s' ", exception));
            }
        }
    }

    private Participant createParticipant() {
        System.out.println("Name:");
        String firstName = scanner.nextLine();
        System.out.println("Surname:");
        String lastName = scanner.nextLine();
        System.out.println("Id:");
        String id = scanner.nextLine();
        System.out.println("Age:");
        int age = readPositiveNumber();
        scanner.nextLine();
        return new Participant(firstName, lastName, id, age);
    }

    private void printCompetition(Competition competition) {
        System.out.println(competition.toString());
    }

    private int readPositiveNumber() {
        int number = -1;
        while (number < 0) {
            try {
                number = scanner.nextInt();
                if (number < 0)
                    System.out.println("Podana liczba musi być dodatnia");
            } catch (InputMismatchException e) {
                System.out.println("Musisz podać liczbę, spróbuj ponownie.");
            } finally {
                scanner.nextLine();
            }
        }
        return number;
    }
}