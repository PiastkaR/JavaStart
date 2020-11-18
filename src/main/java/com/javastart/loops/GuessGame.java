package com.javastart.loops;

import java.util.Scanner;

class GuessGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        final int number = 500;
        int userInput;
        System.out.println("Zgadnij liczbę");

        while ((userInput = reader.nextInt()) != number) {
            if (userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
        }

        System.out.println("Brawo, zgadłeś o jaką liczbę chodziło, wygrywasz złote kalesony");

        reader.close();
    }
}