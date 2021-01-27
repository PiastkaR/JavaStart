package com.javastart.methodreferences.names;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NamesApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Kasia", "Basia", "Zosia", "Asia", "SoloZola"));
        names.sort(String::compareToIgnoreCase);

        System.out.println(names);
    }
}
