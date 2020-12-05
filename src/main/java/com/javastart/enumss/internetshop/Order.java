package com.javastart.enumss.internetshop;

import java.util.Objects;

public class Order {
    private String name;
    private double price;
    private OrderStatus orderStatus;

    public Order(String name, double price, OrderStatus orderStatus) {
        this.name = name;
        this.price = price;
        this.orderStatus = orderStatus;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Order[] getOrdersWithGivenStatus(Order[] orders, OrderStatus orderStatus) {
        Order[] ordersToReturn = new Order[orders.length];
        int orderIterator = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i].orderStatus.equals(orderStatus)) {
                ordersToReturn[orderIterator] = orders[i];
                orderIterator++;
            }
        }
        return ordersToReturn;
    }

    @Override
    public String toString() {
        return name + "(" + price + "zl)" + orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                Objects.equals(name, order.name) &&
                orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, orderStatus);
    }
}
