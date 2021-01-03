package com.javastart.wrappers;

class MathOperations {
    public static void main(String[] args) {
        double value = 9;
        double pow = Math.pow(value, 2);
        System.out.println("Liczba podniesiona do kwadratu: " + pow);

        double sqrt = Math.sqrt(value);
        System.out.println("Pierwiastek kwadratowy liczby: " + sqrt);

        System.out.println("Co jest większe, 4, czy 40? " + Math.max(4, 40));

        double area = Math.PI * Math.pow(value, 2); //PI * R^2
        System.out.println("Pole koła o promieniu 9: " + area);
    }
}