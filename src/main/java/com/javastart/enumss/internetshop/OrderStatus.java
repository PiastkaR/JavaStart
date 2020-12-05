package com.javastart.enumss.internetshop;

public enum OrderStatus {
    NEW("Nowy"),
    PAID("Zapłacony"),
    SHIPPED("Dowieziony"),
    DELIVERED("Dostarczony"),
    CANCELED("Anulowany");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
