package com.javastart.internalclasses.car;

class Car {
    private Engine engine;
    private int fuel;

    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem " + engine.engineType);
    }

    public void go() throws InterruptedException { // ten exception jest kontrolowany wiec mozna wyrzucic go wyzej. Czy chcemy?
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa");
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

    public void refuel(int liters) {
        Car.this.fuel = fuel + liters;
    }

    public class Engine {

        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String type) {
            engineType = type;
        }

        public void consumeFuel() {
            fuel = fuel - FUEL_CONSUMPTION;
        }
    }
}