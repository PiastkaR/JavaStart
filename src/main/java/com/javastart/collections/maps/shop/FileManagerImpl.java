package com.javastart.collections.maps.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class FileManagerImpl implements FileManager {

    @Override
    public Map<String, TreeSet<Product>> readFile(String fileName) {
        Shop shop = new Shop(new HashMap<>());
        Map<String, TreeSet<Product>> shopDb = shop.getShopDb();

        try (var fileReader = new Scanner(new File(fileName))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                createProducts(line, shopDb);
            }

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return shopDb;
    }

    private void createProducts(String line, Map<String, TreeSet<Product>> shopDb) {
        String[] data = line.split(";");
        String category = data[0];
        Product product = new Product(data[1], Integer.parseInt(data[2]));

        if (shopDb.containsKey(category)) {
            shopDb.get(category).add(product);
        } else {
            TreeSet<Product> products = new TreeSet<>();
            products.add(product);
            shopDb.put(category, products);
        }
    }
}
