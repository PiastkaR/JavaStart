package com.javastart.wrappers.counter;

import java.util.Scanner;

public class CounterApp {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Please enter text or numbers.");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int countCharacters = countCharacters(line);
        int countNumbers = countNumbers(line);
        int largestNumber = findLargestNumber(line);

        System.out.println("Number of characters in text: " + countCharacters);
        System.out.println("Number of numbers in text: " + countNumbers);
        System.out.println("Larges number in text: " + largestNumber);
        scanner.close();
    }

    private static int findLargestNumber(String line) {
        int largestNo = 0;
        for (int i = 0; i < line.length(); i++) {
            char charI = line.charAt(i);
            boolean digit = Character.isDigit(charI);
            if (digit) {
                int value = Character.getNumericValue(charI);
                largestNo = value;
            }
        }
        return largestNo;
    }

    private static int countCharacters(String line) {
        int characterNumber = 0;
        for (int i = 0; i < line.length(); i++) {
            boolean letter = Character.isLetter(line.charAt(i));
            if (letter)
                characterNumber++;
        }
        return characterNumber;
    }

    private static int countNumbers(String line) {
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            boolean digit = Character.isDigit(line.charAt(i));
            if (digit)
                counter++;
        }
        return counter;
    }
}
