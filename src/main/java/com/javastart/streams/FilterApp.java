package com.javastart.streams;

import java.util.stream.Stream;

public class FilterApp {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x + 1)
                .filter(num -> num > 100 && num < 1000 && num % 5 == 0)
                .limit(10)
                .map(num -> num * 3)
                .forEach(System.out::println);
    }
}
