package com.javastart.supersuper;

public class Fruit {
    private int weight;
    private String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getInfo() {
        return "Fruit weight: " + weight + " type: " + type;
    }
}
