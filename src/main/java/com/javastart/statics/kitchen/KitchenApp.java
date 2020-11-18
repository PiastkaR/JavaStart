package com.javastart.statics.kitchen;

import java.util.Scanner;

public class KitchenApp {

    public static void main(String[] args) {
        int option;
        final int exit = 0;
        final int spoon = 1;
        final int teaspoon = 2;
        final int glass = 3;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hallo, indicate what will be calculated?");
            System.out.println("1 - Spoon");
            System.out.println("2 - Teaspoon");
            System.out.println("3 - Glass");
            System.out.println("0 - Exit");

            option = sc.nextInt();
            sc.nextLine();
            System.out.println("Please enter number of spoons/teaspoons/glasses to recalculate? ");
            Scanner input = new Scanner(System.in);
            double number = input.nextDouble();

            switch (option) {
                case (spoon):
                    info(Calculator.spoonToMl(number));
                    break;
                case (teaspoon):
                    info(Calculator.teaSpoonToMl(number));
                case (glass):
                    info(Calculator.glassToMl(number));
                    break;
                default:
                    System.out.println("Wrong option!");

            }

        } while (sc.nextInt() != exit);
    }

    private static void info(double valueToShow) {
        System.out.println("Calculated value is: " + valueToShow + "ml.");
    }
}
