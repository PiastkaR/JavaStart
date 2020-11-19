package com.javastart.statics.car;

class CarTest {
    public static void main(String[] args) {
        Car car = new Car(10, true, true, false, false);
        System.out.println("Starting a car...");
        car.start();
        System.out.println(car.status());
        System.out.println();

        System.out.println("Door opened manually...");
        car.setDoorsOpen(true);
        System.out.println(car.status());
        System.out.println();

        System.out.println("Fuel ends after some time....");
        car.setFuel(0);
        System.out.println(car.status());
    }
}