package com.javastart.comparableandcomparator.estates;

public class Estate implements Comparable<Estate> {
    private String city;
    private double price;
    private double squareMeters;

    public Estate(String city, double price, double squareMeters) {
        this.city = city;
        this.price = price;
        this.squareMeters = squareMeters;
    }

    public double calculatePriceForSquareMeters() {
        return price / squareMeters;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    @Override
    public String toString() {
        return "City: " + city + "Price: " + price + " Sq meters:" + squareMeters + "Price/sqr mtrs: " + price / squareMeters;
    }

    @Override
    public int compareTo(Estate o) {
        if (calculatePriceForSquareMeters() > o.calculatePriceForSquareMeters())
            return 1;
        else if (calculatePriceForSquareMeters() < o.calculatePriceForSquareMeters())
            return -1;
        else
            return 0;
    }
}
