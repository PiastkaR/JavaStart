package com.javastart.supersuper;

public class Apple extends Fruit {
    private String variety;

    public Apple(int weight, String variety) {
        super(weight, "Apple");
        this.variety = variety;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " variety: " + variety;
    }
}
