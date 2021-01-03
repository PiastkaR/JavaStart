package com.javastart.recurence.shopping;

public class Cart {
    private Product[] products = new Product[10];
    private int productCount;

    public void add(Product product) {
        if (productCount < 10) {
            products[productCount] = product;
            productCount++;
        }
    }

    public double totalCost() {
        return sumPrices(0);
    }

    public double sumPrices(int counter) {
        if (productCount == 0)
            return 0;
        else if (counter < (productCount - 1))
            return products[counter].getPrice() + sumPrices(++counter);
        else
            return products[counter].getPrice();
    }
}
