package com.javastart.collections.lists.addition.queue;

import java.util.PriorityQueue;
import java.util.Queue;

class ClientService {
    public static void main(String[] args) {
        Queue<Client> clientQueue = new PriorityQueue<>();

        clientQueue.offer(new Client("grażynka", 3));
        clientQueue.offer(new Client("kokoszko", 1));
        clientQueue.offer(new Client("tyryryry", 5));
        clientQueue.offer(new Client("dumbo", 2));

        System.out.println("Metoda peek() (1): " + clientQueue.peek());
        System.out.println("Metoda peek() (2): " + clientQueue.peek());

        System.out.println("Metoda poll() (1): " + clientQueue.poll());
        System.out.println("Metoda poll() (2): " + clientQueue.poll() + "\n");

        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Peek " + clientQueue.peek());
        System.out.println("Stan kolejki: " + clientQueue);
        System.out.println("Poll " + clientQueue.poll());
        System.out.println("Stan kolejki: " + clientQueue);
    }
}