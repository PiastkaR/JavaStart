package com.javastart.excercises;

public class PlantMain {

    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Plant plant2 = new Plant();
        Plant plant3 = new Plant();
        plant1.name = "paprotka";
        plant1.waterUsage = 1;

        plant2.name = "cps";
        plant2.waterUsage = 2.4;

        plant3.name = "thc";
        plant3.waterUsage = 8.6;

        double tygodniowe = plant1.waterUsage * 7 + plant2.waterUsage * 7 + plant3.waterUsage * 7;

        System.out.println("Dzienne zapotrzebowanie: " + plant1 + ", " + plant2 + ", " + plant3 +
                "tygpdniowe: " + tygodniowe);
    }
}
