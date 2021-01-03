package com.javastart.wrappers;

import java.math.BigDecimal;

class BigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println("a - b = " + (a - b));

        BigDecimal aBig = BigDecimal.valueOf(a);
        BigDecimal bBig = BigDecimal.valueOf(b);
        System.out.println("aBig - bBig = " + aBig.subtract(bBig));
    }
}