package com.javastart.collections;

import java.util.Arrays;
import java.util.List;

class ArrTest {
    public static void main(String[] args) {
        Integer[] ints = { 5, 10, 15 };
        List<Integer> lista = Arrays.asList(ints);
        for (Integer num : lista) {
            System.out.println(num);
        }
    }
}