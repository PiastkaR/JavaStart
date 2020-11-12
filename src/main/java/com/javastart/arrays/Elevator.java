package com.javastart.arrays;

public class Elevator {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("Limit of people has been reached.");
        }
    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda wystartowała");
        } else {
            int overload = getTotalWeight() - maxWeight;
            System.out.println("Winda jest przeciążona o " + overload + "kg");
        }
    }

    int getTotalWeight() {
        int totalWeight = 0;
        if (people[0] != null)
            totalWeight += people[0].getWeight();
        if (people[1] != null)
            totalWeight += people[1].getWeight();
        if (people[2] != null)
            totalWeight += people[2].getWeight();
        if (people[3] != null)
            totalWeight += people[3].getWeight();

        return totalWeight;
    }

    private boolean weightIsCorrect() {
        return getTotalWeight() <= maxWeight;
    }

    void clear() {

    }
}
