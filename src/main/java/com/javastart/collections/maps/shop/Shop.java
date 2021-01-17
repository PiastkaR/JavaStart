package com.javastart.collections.maps.shop;

import java.util.Map;
import java.util.TreeSet;

public class Shop {
    private Map<String, TreeSet<Product>> shopDb;

    public Shop(Map<String, TreeSet<Product>> shopDb) {
        this.shopDb = shopDb;
    }

    public Map<String, TreeSet<Product>> getShopDb() {
        return shopDb;
    }

    public void setShopDb(Map<String, TreeSet<Product>> shopDb) {
        this.shopDb = shopDb;
    }
}
