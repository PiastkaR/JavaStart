package com.javastart.abstractclass.vehicle;

class CarApp {
    public static void main(String[] args) {
        // błąd nie można tworzyć obiektów typów abstrakcyjnych
        // Vehicle vehicle = new Vehicle();

        Vehicle vehicle = new Car(); //polimorfizm
        vehicle.speedUp();
        System.out.println("Samochód jedzie z prędkością: " + vehicle.getSpeed());
    }
}