package com.javastart.collections.lists.addition.queue.todo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private static Scanner scanner = new Scanner(System.in);
    private static final int ADD = 0;
    private static final int REMOVE = 1;
    private static final int EXIT = 2;
    private static Queue<Task> queue = new PriorityQueue<>();

    public void mainLoop() {
        runAnOption();
    }

    private void runAnOption() {
        Option option;

        do {
            printOptions();
            option = readOptionFromUser();
            scanner.nextLine();
            handleChoice(option);
        } while (option.option != EXIT);
    }

    private void handleChoice(Option option) {
        if (option.option == ADD) {
            Task task = addTask();
            queue.offer(task);
        } else if (option.option == REMOVE) {
            removeTask();
        } else if (option.option == EXIT) {
            System.out.println("Exiting the program..");
            System.exit(0);
        }
    }

    private void removeTask() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            Task nextTask = queue.poll();
            System.out.print("Task removed: ");
            System.out.println(nextTask);
        }
    }

    private Task addTask() {
        System.out.println("Please enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter the description: ");
        String description = scanner.nextLine();
        System.out.println("Please enter the priority(LOW/MEDIUM/HIGH): ");
        String priority = scanner.nextLine();
        Task.Priority valueOfPriority = Task.Priority.valueOf(priority);

        return new Task(name, description, valueOfPriority);
    }

    private Option readOptionFromUser() {
        return Option.createFromInt(scanner.nextInt());
    }

    private void printOptions() {
        Option[] values = Option.values();
        for (Option value : values) {
            System.out.println(value + " " + value.option);
        }
    }

    private enum Option {
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Zrób kolejne zadanie"),
        EXIT(2, "Wyjdź");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }
    }
}
