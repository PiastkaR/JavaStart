package com.javastart.inheritance.factory;

public class Tire extends Part {
    private int width;

    public void info() {
        System.out.println("Tire: " + " width: " + width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
