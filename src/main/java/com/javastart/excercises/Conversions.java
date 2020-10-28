package com.javastart.excercises;

public class Conversions {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.8;
        int c = (int) b;//konwersja zawezajaca z typu ogolnego na mniej pojemny
        double d = a;//konwesrja rozszerzajaca

        double x = 10000000000000.0;
        System.out.println(c);
        boolean instance = "Kasia" instanceof java.lang.String;
        System.out.println(instance); // "Kasia" jest typu String
////////////////////////////////////////
        char letter1 = 'k';
        char letter2 = 'o';
        char letter3 = 't';
        System.out.println("Błędne \"sumowanie\" znaków");
        System.out.println(letter1 + letter2 + letter3);
        System.out.println("Tekst jawny");
        System.out.println("" + letter1 + letter2 + letter3);
        letter1++;
        letter2++;
        letter3++;
        System.out.println("Tekst zaszyfrowany");
        System.out.println("" + letter1 + letter2 + letter3);
    }
}
