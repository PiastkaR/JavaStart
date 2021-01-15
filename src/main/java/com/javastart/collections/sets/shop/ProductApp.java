package com.javastart.collections.sets.shop;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.out;

public class ProductApp {
    private static final String EXIT = "exit";
    private static final String ADD = "add";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        runProgram(products);
    }

    private static void runProgram(Set<Product> products) {
        out.println("Please 'add' new product or 'exit'.");
        String line = scanner.nextLine();
        do {
                addProduct(products);
                scanner.nextLine();
        }
        while (!line.equals(EXIT));
        printProducts(products);
        out.println("Exiting program...");
    }

    private static void addProduct(Set<Product> products) {
        Product product = createProduct();
        if (products.contains(product)) {
            askToReplace(products, product);
        }
        products.add(product);
    }

    private static Product createProduct() {
        out.println("Please enter product name and price.");
        String name = scanner.nextLine();
        double price = scanner.nextDouble();

        return new Product(name, price);
    }

    private static void askToReplace(Set<Product> products, Product product) {
        out.println("This product exists. Do you want to override? y/n");
        String line = scanner.nextLine();
        switch (line) {
            case ("y"):
                products.remove(product);
                addProduct(products);
                break;
            case ("n"):
                out.println("Product not added.");
                break;
            default:
                out.println("Product not override.");
        }
    }

    private static void printProducts(Set<Product> products) {
        out.println("All added products: " + products.toString());
        System.exit(0);
    }
}
