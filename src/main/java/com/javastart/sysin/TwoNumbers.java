package com.javastart.sysin;

import java.util.Scanner;

class TwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj A: ");
        double a = input.nextDouble();
        System.out.println("Podaj B: ");
        double b = input.nextDouble();

        input.close();
        System.out.println("A + B = " + (a + b));
    }
}