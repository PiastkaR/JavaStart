package com.javastart.constructors;

class Offer {
    Product product;
    double price;
    boolean special;

    Offer(Product product, double price, boolean special) {
        this.price = price;
        this.product = product;
        this.special = special;
    }

    void printInfo() {
        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }
}