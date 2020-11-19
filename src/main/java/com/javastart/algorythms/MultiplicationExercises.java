package com.javastart.algorythms;

import java.util.Scanner;

public class MultiplicationExercises {
    public static void main(String[] args) {
        int index = 0;
        int multi = 1;
        int next = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter number: ");
        next = input.nextInt();
        input.nextLine();

        for (int i = 0; index < 5; i++) {
            multi = multi * next;
            index++;
        }
        if (multi >= 0) {
            System.out.println("Number non negative.");
        } else {
            System.out.println("Number negative");
        }
        input.close();
    }
}
