package com.javastart.lambdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(1000);

        List<Integer> integers = generateList(10, supplier);
        consumeList(integers, System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        List<Integer> newList = removeAllDivideableByTwo(integers, x -> x % 2 != 0);
        consumeList(newList, System.out::println);
    }

    private static <T> List<T> removeAllDivideableByTwo(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    //TODO z iteratorem!! - tu usuwa jesli jest podzielne przez 2
    private static <T> void filterList(List<T> list, Predicate<T> pred) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            T tmp = it.next();
            if (pred.test(tmp)) {
                it.remove();
            }
        }
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    private static <T> List<T> generateList(int number, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            result.add(supplier.get());
        }

        return result;
    }
}
