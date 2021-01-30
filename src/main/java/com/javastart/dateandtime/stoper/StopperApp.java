package com.javastart.dateandtime.stoper;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopperApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please press enter to start counting time...");
        sc.nextLine();
        Instant t1 = Instant.now();

        System.out.println("Please press enter to stop counting time...");
        sc.nextLine();
        Instant t2 = Instant.now();

        Duration duration = Duration.between(t1, t2);

        System.out.println("Time measured in seconds: " + duration.getSeconds());
    }
}
