package com.javastart.encapsulation.object;

class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;
       
        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;
        
        DiscountService discountService = new DiscountService();
        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        PrintService printService = new PrintService();
        printService.info(client1, price1, priceDiscount1);
        printService.info(client2, price2, priceDiscount2);
    }
}