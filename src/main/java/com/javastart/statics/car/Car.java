package com.javastart.statics.car;

public class Car {
    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARNING_DOORS_OPEN = 500;

    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Car(int fuel, boolean engineOk, boolean engineOn, boolean fuelFlapOpen, boolean doorsOpen) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doorsOpen;
    }

    public String status() {
        switch (systemCheck()) {
            case (100):
                return "All systems are good you can go safely.";
            case (200):
                return "Please check engine.";
            case (300):
                return "Please add some fuel...";
            case (400):
                return "Fuel flap is open! ";
            case (500):
                return "Door is open.";
            default:
                return "Unknown error occurred.";
        }
    }

    public int systemCheck() {
        if (fuel == 0)
            return ERROR_NO_FUEL;
        if (!isEngineOk())
            return ERROR_CHECK_ENGINE;
        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsOpen)
            return WARNING_DOORS_OPEN;
        return OK;
    }

    public int start() {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }

    public void info(String info) {
        System.out.println(info);
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0)
            engineOn = false;
        this.fuel = fuel;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        this.engineOk = engineOk;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsOpen() {
        return doorsOpen;
    }

    public void setDoorsOpen(boolean doorsOpen) {
        this.doorsOpen = doorsOpen;
    }
}
