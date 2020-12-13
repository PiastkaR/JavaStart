package com.javastart.internalclasses.car;

class CarTest {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.refuel(40);
        car.go();
    }
}