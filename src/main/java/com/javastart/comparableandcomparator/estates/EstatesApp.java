package com.javastart.comparableandcomparator.estates;

import java.util.Arrays;

public class EstatesApp {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        EstateAgency estateAgency = fm.readFile("estates.txt");
        System.out.println(estateAgency.toString());

        Arrays.sort(estateAgency.getEstates());
    }
}
