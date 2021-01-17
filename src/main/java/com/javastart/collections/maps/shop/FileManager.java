package com.javastart.collections.maps.shop;

import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;

public interface FileManager {
    Map<String, TreeSet<Product>> readFile(String fileName) throws IOException;
}
