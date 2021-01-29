package com.javastart.streamcollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiThreadApp {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ints.stream()
                .parallel()
                .map(MultiThreadApp::incrementValue)
                .collect(Collectors.toList());

        ints.parallelStream()
                .map(MultiThreadApp::incrementValue)
                .collect(Collectors.toList());
    }

    public static int incrementValue(int x) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("Calculating x.." + x);
        return x + 1;
    }
}
