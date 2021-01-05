package com.javastart.comparableandcomparator.estates;

import java.util.Comparator;

public class PriceToSquareMetersComparator implements Comparator<Estate> {
    @Override
    public int compare(Estate o1, Estate o2) {
        if (o1.calculatePriceForSquareMeters() > o2.calculatePriceForSquareMeters())
            return 1;
        else
            return -1;
    }
}
