package com.javastart.loops.temperature;

import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter actual temperature: ");
        double actualTemp = in.nextDouble();
        in.nextLine();

        System.out.println("Please enter desired temperature: ");
        double desiredTemp = in.nextDouble();
        in.nextLine();
        TemperatureEngine temperatureEngine = new TemperatureEngine(actualTemp, desiredTemp);

        while (!temperatureEngine.targetTemperatureReached()) {
            System.out.println(temperatureEngine.getCurrentTemperature());
            temperatureEngine.adjustTemperature();
        }
        System.out.println("Temperature reached" + temperatureEngine.getCurrentTemperature() + " degrees");

    }
}
