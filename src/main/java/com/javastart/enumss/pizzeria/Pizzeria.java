package com.javastart.enumss.pizzeria;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        System.out.println("Please indicate pizza of your choice:");

        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza.toString());
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What is your choice?: ");
        Pizza pizza = Pizza.valueOf(input.nextLine());

        System.out.println("Thanks for choosing: " + pizza.name());
        input.close();

    }
}
