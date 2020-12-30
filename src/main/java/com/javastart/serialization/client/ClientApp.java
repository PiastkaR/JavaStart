package com.javastart.serialization.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "clients.csv";
        Client[] clients = readFile(fileName);
        bestSpender(clients);

        System.out.println("Please write desired country for clients list: ");
        String country = scanner.nextLine();
        printCountryClients(clients, country);
        printValueForGivenCountry(clients, country);
        scanner.close();
    }

    private static void printValueForGivenCountry(Client[] clients, String country) {
        double total = 0;
        int clientsFromGivenCountry = 0;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                total += client.getValue();
                clientsFromGivenCountry++;
            }
        }
        if (total > 0) {
            double average = total / clientsFromGivenCountry;
            System.out.printf("Average value of client from: %s is: %s%n", average, country);
        }
    }

    private static void bestSpender(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getValue() > mostValuableClient.getValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("Most valuable client is: " + mostValuableClient);
    }

    private static void printCountryClients(Client[] clients, String country) {
        boolean isClient = false;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                isClient = true;
            }
        }
        if (!isClient) {
            throw new NoSuchElementException();
        }
    }

    private static Client[] readFile(String fileName) {
        int fileLines = countFileLines(fileName);
        Client[] clients = new Client[fileLines];
        try (
                Scanner scanner = new Scanner(new File(fileName))
        ) {
            scanner.nextLine();
            for (int i = 0; i < fileLines; i++) {
                String line = scanner.nextLine();
                clients[i] = createClientFromLine(line);
            }
        } catch (FileNotFoundException exception) {
            System.err.println("FileNotFoundException" + exception);
        }

        return clients;
    }

    private static Client createClientFromLine(String line) {
        String[] data = line.split(",");
        int id = Integer.parseInt(data[0]);
        String firstName = data[1];
        String lastName = data[2];
        String country = data[3];
        double value = Double.parseDouble(data[4]);
        return new Client(id, firstName, lastName, country, value);
    }

    private static int countFileLines(String fileName) {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();//get rid of header
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        } catch (FileNotFoundException exception) {
            System.err.println("File not found. " + exception);
        }
        return lines;
    }
}
