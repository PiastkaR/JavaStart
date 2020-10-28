package com.javastart.overloading;

import java.util.Random;

public class Dice {
    int top;
    Random random = new Random();

    Dice() {
        this.top = random.nextInt(6) + 1;
    }

    Dice(int number) {
        this.top = top;
    }

    int roll() {
        return random.nextInt(6) + 1;
    }

    void printInfo() {
        System.out.println("Liczba oczek na kostce: " + roll());
    }
}
