package com.javastart.multithread;

public class Counter {
    private int value;

    public void increment() {
        synchronized (this) { //zapewnia synchronizacje
            value += 1;
        }
    }

    public synchronized void increment2() {
        value += 1;
    }

    public int getValue() {
        return value;
    }
//    class Counter {
//        public static void sampleStaticMethod() {
//            synchronized (Counter.class) {
//                System.out.println('xxx');
//            }
//        }

//    class Counter {
//        public synchronized static void sampleStaticMethod() {
//            System.out.println('xxx');
//        }
//    }
}
