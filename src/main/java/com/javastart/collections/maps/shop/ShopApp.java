package com.javastart.collections.maps.shop;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ShopApp {
    private static final String FILE_NAME = "shop.csv";
    private static final String RTV = "rtv";
    private static final String OFFICE = "biuro";
    private static final String PC = "komputery";

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, TreeSet<Product>> shopDB = manageFile();
        showCategories();
        String category = readCategory();
        TreeSet<Product> products = shopDB.get(category);

        showProductsForAnOption(category, shopDB);
        printAvgPrice(products);
        printCheapestAndExpensiveProduct(products);
    }

    private static Map<String, TreeSet<Product>> manageFile() {
        FileManager fileManager = new FileManagerImpl();
        Map<String, TreeSet<Product>> shopDB = null;

        try {
            shopDB = fileManager.readFile(FILE_NAME);
        } catch (IOException exception) {
            System.err.println("No file with data!");
        }

        return shopDB;
    }

    private static void showProductsForAnOption(String category, Map<String, TreeSet<Product>> shopDB) {
        TreeSet<Product> products = shopDB.get(category);
        System.out.println(products.toString());
    }

    private static void printAvgPrice(TreeSet<Product> products) {
        double sumPrice = 0;
        for (Product product : products) {
            sumPrice += product.getPrice();
        }
        double avgPrice = sumPrice / products.size();
        System.out.println("Average price: " + avgPrice);
    }

    private static void printCheapestAndExpensiveProduct(TreeSet<Product> products) {
        System.out.println("Cheapest product: " + products.first());
        System.out.println("Most expensive product: " + products.last());
    }

    private static String readCategory() {
        return sc.nextLine();
    }

    private static void showCategories() {
        StringBuilder sb = new StringBuilder();
        sb.append("Please indicate category to show: ");
        sb.append(RTV + " ");
        sb.append(OFFICE + " ");
        sb.append(PC);

        System.out.println(sb.toString());
    }
}
