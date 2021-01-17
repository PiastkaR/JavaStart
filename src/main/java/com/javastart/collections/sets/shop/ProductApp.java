package com.javastart.collections.sets.shop;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProductApp {
    private static final int ADD_PRODUCT = 0;
    private static final int EXIT = 1;
    private static final int DISCARD_PRODUCT = 0;
    private static final int REPLACE_PRODUCT = 1;

    private static Set<Product> products = new HashSet<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainLoop();
    }

    private static void mainLoop() {
        int option;
        do {
            printOptions();
            option = readOption();
            evaluateOption(option);
        } while (option != EXIT);
    }

    private static void printOptions() {
        System.out.println("Dostępne opcje:");
        System.out.println(" > Dodaj nowy produkt - " + ADD_PRODUCT);
        System.out.println(" > Koniec programu - " + EXIT);
    }

    private static int readOption() {
        System.out.println("Wybierz opcję:");
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static void evaluateOption(int option) {
        if (option == ADD_PRODUCT)
            addNextProduct();
        else if (option == EXIT)
            printProducts();
        else
            System.out.println("Nieznana opcja");
    }

    private static void printProducts() {
        System.out.println("Wszystkie produkty:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private static void addNextProduct() {
        Product product = createProduct();
        if (products.contains(product)) {
            askAndReplaceProduct(product);
        } else {
            addProduct(product);
        }
    }

    private static Product createProduct() {
        System.out.println("Podaj nazwę produktu:");
        String name = scanner.nextLine();
        System.out.println("Podaj cenę produktu:");
        double price = scanner.nextDouble();
        return new Product(name, price);
    }

    private static void askAndReplaceProduct(Product product) {
        System.out.println("Znaleziono produkt o takiej nazwie, wybierz co chcesz zrobić");
        System.out.println(" > Zignoruj produkt - " + DISCARD_PRODUCT);
        System.out.println(" > Nadpisz produkt - " + REPLACE_PRODUCT);
        int option = readOption();
        scanner.nextLine();
        if (option == REPLACE_PRODUCT) {
            products.remove(product);
            addProduct(product);
        } else
            System.out.println("W bazie pozostawiono poprzedni produkt");
    }

    private static void addProduct(Product product) {
        products.add(product);
        System.out.println("Produkt dodany do bazy");
    }
}
