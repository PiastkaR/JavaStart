package com.javastart.collections.lists.addition;

import java.util.ArrayList;
import java.util.Scanner;

public class DividedByFive {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> emptyList = new ArrayList();
        ArrayList<Integer> filledList = fillList(emptyList);
        printStatistics(filledList);
    }

    private static ArrayList<Integer> fillList(ArrayList<Integer> integerList) {
        boolean nonNegative = true;
        boolean dividedByFive = true;

        while (nonNegative && dividedByFive) {
            System.out.println("Please input another number dividable by 5 and non negative: ");
            String input = scanner.nextLine();
            Integer integer = Integer.valueOf(input);
            nonNegative = checkIfNegative(input);
            dividedByFive = checkIfDividableByFive(input);
            integerList.add(integer);
        }
        return integerList;
    }

    private static boolean checkIfDividableByFive(String input) {
        int i = Integer.parseInt(input);
        return i >= 0 && i % 5 == 0;
    }

    private static boolean checkIfNegative(String input) {
        return Integer.parseInt(input) > 0;
    }


    private static void printStatistics(ArrayList<Integer> integerList) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        if (!integerList.isEmpty()) {

            for (Integer number : integerList) {
                sum = number + sum;
            }
            sb.append("Correct values inserted: " + integerList.size());
            sb.append(" Their sum: " + sum);
            sb.append(" Their average: " + sum / integerList.size());
            System.out.println(sb.toString());
        }
    }
}
