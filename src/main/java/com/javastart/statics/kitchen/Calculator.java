package com.javastart.statics.kitchen;

public class Calculator {
    private static double GLASS = 250;
    private static double TEA_SPOON = 5;
    private static double SPOON = 5;

    public static double glassToMl( double numberOfGlasses) {
        return numberOfGlasses * GLASS;
    }

    public static double teaSpoonToMl( double numberOfGlasses) {
        return numberOfGlasses * TEA_SPOON;
    }

    public static double spoonToMl( double numberOfGlasses) {
        return numberOfGlasses * SPOON;
    }

}
