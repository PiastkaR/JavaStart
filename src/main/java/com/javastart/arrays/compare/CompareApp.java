package com.javastart.arrays.compare;

import java.util.Arrays;
import java.util.Scanner;

public class CompareApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter free text 1: ");
        String text1 = scanner.nextLine().toUpperCase();
        System.out.println("Please enter free text 2: ");
        String text2 = scanner.nextLine().toUpperCase();
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();

        Arrays.toString(chars1);
        Arrays.toString(chars2);
        System.out.println("Are arrays the same? (case insensitive)");
        System.out.println(Arrays.equals(chars1, chars2));
        scanner.close();
    }

    private static String[] textToArray(String inputString) {
        int length = inputString.length();
        String[] line = new String[length];
        for (int i = 0; i < length; i++) {
            line[i] = String.valueOf(inputString.charAt(i));
        }
        return line;
    }
}
