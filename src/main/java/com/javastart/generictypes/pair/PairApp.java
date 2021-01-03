package com.javastart.generictypes.pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Anna", 1986);
        Pair<Double, Integer> p2 = new Pair<>(123.456, 12);
        Pair<String, String> p3 = new Pair<>("Jan", "Kowalski");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.printInfo(p1);
        p2.printInfo(p2);
        p3.printInfo(p3);
    }
}
