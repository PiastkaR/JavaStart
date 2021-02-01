package com.javastart.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericsApp {
    public static void main(String[] args) {
        List<Pair> pariList = new ArrayList<>(Arrays.asList(new Pair("pole1", 1), new Pair("pole1", 2.0), new Pair("pole1", "3")));
        printInfo(pariList, System.out::println);
    }

    private static <T> void printInfo(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
