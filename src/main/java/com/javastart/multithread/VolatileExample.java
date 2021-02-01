package com.javastart.multithread;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class VolatileExample {
    private static volatile boolean isDone = false;

    public static void main(String[] args) {
        Thread backgroundJob = new Thread(() -> {
            try {
                Thread.sleep(Duration.ofSeconds(2).toMillis());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Job is done!");
            isDone = true;
        });
        Thread heavyWorker = new Thread(() -> {
            LocalDateTime start = LocalDateTime.now();
            while (!isDone) {
                //doing some lonmg and important stuff
            }
            long durationInMills = ChronoUnit.MILLIS.between(start, LocalDateTime.now());
            System.out.println("I have been notified about finished job after " + durationInMills + " miliseconds");
        });

        heavyWorker.start();
        backgroundJob.start();
    }
}

