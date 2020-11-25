package com.javastart.inheritance.factory;

public class ExhaustPart extends Part {
    private boolean isEuropeanStandard;

    public void info() {
        System.out.println("Exhaust: " + " isEuropeanStandard? " + isEuropeanStandard);
    }

    public boolean isEuropeanStandard() {
        return isEuropeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        isEuropeanStandard = europeanStandard;
    }
}
