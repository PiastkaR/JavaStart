package com.javastart.statics;

import java.util.Scanner;

class PrintNumbers {

    private static final int EXIT = 0;

    private static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int start, end;
        do {
            System.out.println("Pierwsza liczba: ");
            start = input.nextInt();
            System.out.println("Druga liczba: ");
            end = input.nextInt();
            printNumbers(start, end);

            System.out.println("Koniec programu, wprowadź " + EXIT);
            System.out.println("Kontynuuj, wprowadź wartość inną od " + EXIT);
        } while (input.nextInt() != EXIT);

        input.close();
    }
}