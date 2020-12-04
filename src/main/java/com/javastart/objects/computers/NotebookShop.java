package com.javastart.objects.computers;

public class NotebookShop {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 123);
        Computer computer1 = new Computer("Intel", 456);
        Computer computer2 = new Computer("AMD", 123);
        Computer computer3 = new Computer("Intel", 123);
        Computer computer4 = new Computer("Intel", 456);
        Computer computer5 = new Computer("AMD", 456);
        Computer computer6 = new Computer("AMD", 456);
        Computer computer7 = new Computer("AMD", 456);

        DataStore dataStore = new DataStore();
        dataStore.add(computer);
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);
        dataStore.add(computer4);
        dataStore.add(computer5);
        dataStore.add(computer6);
        dataStore.add(computer7);

        int availability = dataStore.checkAvailability(computer5);
        System.out.println("Number of available computers: " + availability);

        System.out.println("All available computers:");
        for (Computer comp : dataStore.getComputers()) {
            System.out.println(comp);
        }
    }
}
