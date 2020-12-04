package com.javastart.objects.computers;

public class DataStore {
    private static final int MAX_COMPUTERS = 100;

    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int computersNumber = 0;

    public void add(Computer computer) {
        if (computersNumber < MAX_COMPUTERS) {
            computers[computersNumber] = computer;
            computersNumber++;
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[computersNumber];
        for (int i = 0; i < computersNumber; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public int checkAvailability(Computer computer) {
        if(computer == null)
            return 0;

        int counter = 0;
        for (int i = 0; i < computers.length; i++) {
            if (computer.equals(computers[i])) {
                counter++;
            }
        }
        return counter;
    }
}
