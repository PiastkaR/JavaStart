package com.javastart.methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class PersonOperators {
    private static String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    private static String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    private static int[] ages = {22, 33, 44, 55};

    public static void main(String[] args) {
        Supplier<Person> supplier1 = Person::new;
        PersonSupplier supplier = Person::new;
        List<Person> people = generateRandomList(supplier);
        consumeList(people, System.out::println);

        System.out.println("Porownanie supplierow z konstruktorami bez i 3 argumentowymi...");
        System.out.println(supplier1.get());
        System.out.println(supplier.get(firstNames, lastNames, ages));
    }

    private static List<Person> generateRandomList(PersonSupplier supplier) {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            result.add(supplier.get(firstNames, lastNames, ages));
        }
        return result;
    }

    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}