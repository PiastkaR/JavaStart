package com.javastart.simpletypes;

public class Variables {
    public static void main(String[] args) {
        String firstName = "Jan", inneImie = "deklaracjePoPrzecinku";
        String lastName = "Kowalski";
        int age = 25;
        final long PESEL = 1234365567l;
        var x = 5;
        System.out.println(x);
        System.out.println(firstName + lastName + " ma " + age + " lat");
        System.out.println(lastName + "firstName ma PESEl " + PESEL);
        System.out.println(firstName + lastName + " ma wzrost to 183cm");
        System.out.println("Jesli Jan urosnie jeszcze 5 cm bedzii mial 188 cm");

        firstName = "Zdzisiek";
        System.out.println("jego nowe imie " + firstName);
        x = 2345675;
        System.out.println(x);
    }
}
