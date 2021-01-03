package com.javastart.recurence.shopping;

class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add(new Product("mleko", 1));
        cart.add(new Product("czekolada", 2));
        cart.add(new Product("jogurt", 3));

        double cartCost = cart.totalCost();
        System.out.println("Koszt koszyka: " + cartCost + "zł");
    }
}