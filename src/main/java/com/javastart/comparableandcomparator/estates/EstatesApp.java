package com.javastart.comparableandcomparator.estates;

import java.util.Arrays;

public class EstatesApp {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        Estate[] estates = fm.readFile("estates.txt");
        System.out.println("Before sorting: ");
        printEstates(estates);

        PriceToSquareMetersComparator priceToSquareMetersComparator = new PriceToSquareMetersComparator();
        Arrays.sort(estates);
        System.out.println("Post sorting: ");
        printEstates(estates);

        System.out.println("Post sorting with comparator (should be the same): ");
        Arrays.sort(estates, priceToSquareMetersComparator);
        printEstates(estates);
    }

    private static void printEstates(Estate[] estates) {
        for (Estate estate : estates) {
            System.out.println(estate.toString());
        }
    }
}
