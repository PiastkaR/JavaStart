package com.javastart.multithread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I am inside a thread");
    }

    Thread thread = new MyThread(); //tak sie zaczyna threada
}
