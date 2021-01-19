package com.javastart.collections.lists.addition.queue;

class Client implements Comparable<Client> {
    private String nickname;
    private int ordersNumber;

    public Client(String nickname, int ordersNumber) {
        this.nickname = nickname;
        this.ordersNumber = ordersNumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(int ordersNumber) {
        this.ordersNumber = ordersNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nickname='" + nickname + '\'' +
                ", ordersNumber=" + ordersNumber +
                '}';
    }

    @Override
    public int compareTo(Client c) {
        return -Integer.compare(this.ordersNumber, c.ordersNumber);
    }
}