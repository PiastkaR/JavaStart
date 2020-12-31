package com.javastart.recurence;

public class Factorial {
    public static void main(String[] args) {
        int argument = 5;
        int result = factorial(argument);
        int result2 = factorial2(argument);
        System.out.println("Silnia:" + argument + "=" + result);
        System.out.println("Silnia2:" + argument + "=" + result2);
    }

    private static int factorial2(int argument) {
        return argument > 1 ? argument * factorial2(argument - 1) : 1;
    }

    private static int factorial(int argument) {
        if (argument > 1)
            return argument * factorial(argument - 1);
        else
            return 1;
    }

}
