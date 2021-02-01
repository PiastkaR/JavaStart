package com.javastart.multithread;

import java.time.Duration;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class NativeConsumerProducer {
    private static final Random generator = new Random();
    private static final Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        int itemCount = 5;

        Thread producer = new Thread(() -> {
            for (int i = 0; i < itemCount; i++) {
                try {
                    Thread.sleep(Duration.ofSeconds(generator.nextInt(5)).toMillis());
                } catch (InterruptedException exception) {
                    throw new RuntimeException(exception);
                }
                synchronized (queue) {
                    queue.add("Item no. " + i);
                    queue.notify();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            int itemsLeft = itemCount;
            int counterOfLoopWhileWaiting = 0;
            while (itemsLeft > 0) {
                String item;
                synchronized (queue) {
                    try {
                        queue.wait();
                        counterOfLoopWhileWaiting++;
                    } catch (InterruptedException exception) {
                        throw new RuntimeException(exception);
                    }
                    item = queue.poll();
                }
                itemsLeft--;
                System.out.println("Consumer got item: " + item);
                System.out.println("Counter " + counterOfLoopWhileWaiting); //Wypluje duza liczbe jesli nie bedzie queue.notify();
            }
        });

        consumer.start();
        producer.start();
    }
}
