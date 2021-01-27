package com.javastart.methodreferences;

@FunctionalInterface
public interface PersonSupplier {
    Person get(String[] a, String[] b, int[] c);
}
