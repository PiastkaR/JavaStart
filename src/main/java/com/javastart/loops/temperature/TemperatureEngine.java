package com.javastart.loops.temperature;

public class TemperatureEngine {
    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    private double currentTemperature;
    private double targetTemperature;

    TemperatureEngine(double currentTemperature, double targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public void adjustTemperature() {
        double temperatureDiff = targetTemperature - currentTemperature;
        if (temperatureDiff > 0) {
            currentTemperature += 0.5;
        } else {
            currentTemperature -= 0.5;
        }
    }

    public void info() {
        System.out.println("Temperature is: " + currentTemperature);
    }

    boolean targetTemperatureReached() {
        return currentTemperature == targetTemperature;
    }

}
