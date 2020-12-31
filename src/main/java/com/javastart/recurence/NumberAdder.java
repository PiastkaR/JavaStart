package com.javastart.recurence;

class NumberAdder {
    public static void main(String[] args) {
        int number = sum(500);
        System.out.println(number);
    }

    static int sum(int n) {
        if (n > 1) {
            System.out.println(n + "+" + "sum(" + (n - 1) + ")");
            return n + sum(n - 1);
        } else {
            return n;
        }
    }
}