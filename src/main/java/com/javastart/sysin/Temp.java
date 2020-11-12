package com.javastart.sysin;

import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //pobierz znak nowej linii \n
        sc.nextLine();
        //teraz możesz pobrać od użytkownika napis
        String word = sc.nextLine();
        //obie wartości zostają wyświetlone
        System.out.println(number);
        System.out.println(word);

        sc.close();
    }
}