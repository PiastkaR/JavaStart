package com.javastart.abstractclass.vehicle;

class Car extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 5);
    }
}