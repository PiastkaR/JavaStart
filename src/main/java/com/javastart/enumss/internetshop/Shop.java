package com.javastart.enumss.internetshop;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Order order0 = new Order("Koszulka", 12.4, OrderStatus.DELIVERED);
        Order order1 = new Order("Grażynka", 124, OrderStatus.NEW);
        Order order2 = new Order("Zawadzka", 1240, OrderStatus.PAID);
        Order order3 = new Order("Laptop", 140, OrderStatus.SHIPPED);
        Order order4 = new Order("Prezent", 154, OrderStatus.DELIVERED);
        Order[] orders = {order0, order1, order2, order3, order4};

        Scanner input = new Scanner(System.in);
        System.out.println("Please give me status of you order: ");
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println(status.name());
        }

        OrderStatus orderStatus = OrderStatus.valueOf(input.nextLine());
        Order order = new Order();

        System.out.println("Getting orders with given status: " + orderStatus);
        Order[] ordersWithGivenStatus = order.getOrdersWithGivenStatus(orders, orderStatus);

        System.out.println("Orders with given status: ");
        for (int i = 0; i < ordersWithGivenStatus.length; i++) {
            System.out.println(ordersWithGivenStatus[i]);
        }

        input.close();
    }
}
