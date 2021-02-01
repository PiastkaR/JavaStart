package com.javastart.multithread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I am inside runnable!");
    }

    Thread thread = new Thread(() -> System.out.println("I'm inside runnable!"));
}
