package com.javastart.comparableandcomparator.sortarrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysApp {
    public static void main(String[] args) {
        Integer tab[] = {12, 23, 45, 67, 89, 90, 54, 32, 45, 456, 867, 890, 21, 45, 6789, 3456, 324, 32132};
        System.out.println("Nieposortowana:");
        Arrays.toString(tab);

        Arrays.sort(tab);
        System.out.println("Posortowana rosnaco:");
        for (Integer tabb : tab) {
            System.out.println(tabb);
        }

        Arrays.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        System.out.println("Posortowana malejaco:");
        for (Integer tabb : tab) {
            System.out.println(tabb);
        }
    }
}
