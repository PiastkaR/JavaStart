package com.javastart.excercises;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println(100_000_000);
        System.out.println(1.0/3.0);
        System.out.println(1.0F/3.0F);
        System.out.println('a'); //char - tylko 1 znak!
        System.out.println('a' + 'b'); //suma znakow unicode! w UTF8
        System.out.println('\u2602'); //wyswietlanie znakow specjalnych np parasolka!
        System.out.println('\u0041'); //w Unicode!
        System.out.println("moja informacje\nlol iksde jest enter\t tu jest tabulacja");
        System.out.println("moja informacje \t\"przyklad escape-owania\"");

        System.out.print("Liczba int: ");
        System.out.print("Liczba nieint: ");
        System.out.print(25);
        System.out.print('\n');// print potrzebuje \n na koncu!

    }
}
