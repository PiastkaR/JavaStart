package com.javastart.collections.lists.addition;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionApp {
    static final String EXIT = "exit";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayList<Double> array = new ArrayList<>();
        do {
            try {
                readValueFromUser(array);
            } catch (NumberFormatException exception) {
                System.err.println("Please use NUMBERS only!");
            }
        } while (input.equals(EXIT));

        scanner.close();
    }

    private static void readValueFromUser(ArrayList<Double> list, String input) {
        System.out.println("Please write any number or 'exit' to leave the program.");
        Double number = Double.valueOf(input);
        list.add(number);
    }
}
