package com.javastart.strings;

import java.util.Scanner;

public class Sb {
    public static void main(String[] args) {
        System.out.println("Please give me number of words: ");
        Scanner input = new Scanner(System.in);
        int numberOfWords = input.nextInt();
        String[] strings = new String[numberOfWords];
        input.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Please now type " + numberOfWords + " words:");

        for (int i = 0; i < numberOfWords; i++) {
            strings[i] = input.nextLine();
            System.out.println("Please enter next word: ");
            int length = strings[i].length() - 1;

            char lastLetter = strings[i].charAt(length);
            stringBuilder.append(lastLetter);
        }
        System.out.println("Word created from last letters: " + stringBuilder.toString());
        input.close();
    }

}
