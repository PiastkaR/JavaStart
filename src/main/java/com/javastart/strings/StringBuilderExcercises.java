package com.javastart.strings;

import java.util.Scanner;

public class StringBuilderExcercises {
    public static void main(String[] args) {
        System.out.println("Please give me any word: ");
        Scanner input = new Scanner(System.in);
        String givenWord = input.nextLine();

        String wordAfterChange = "";
        if (Character.isUpperCase(givenWord.charAt(0))) {
            wordAfterChange = givenWord.toUpperCase();
        } else if (Character.isLowerCase(givenWord.charAt(0))) {
            wordAfterChange = givenWord.toLowerCase();
        } else if (!Character.isLetter(givenWord.charAt(0))) {
            wordAfterChange = givenWord;
        }

        System.out.println("Your word after change: " + wordAfterChange);
        input.close();
    }
}
