package com.javastart.collections.lists.addition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionApp {
    public static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        fillList(numbers);
        printData(numbers);
    }

    static void fillList(List<Double> list) {
        System.out.println("Input another number or write \"exit\": ");

        String input = sc.nextLine();
        if (input.equals(AdditionApp.EXIT))
            return;

        try {
            Double num = Double.valueOf(input);
            list.add(num);
        } catch (NumberFormatException e) {
            System.err.println("Please give only numbers!");
        }

        fillList(list);
    }

    static void printData(List<Double> list) {
        double sum = 0;
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Double number : list) {
                sb.append(number);
                sb.append("+");
                sum = sum + number;
            }
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}
