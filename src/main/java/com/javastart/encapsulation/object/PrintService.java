package com.javastart.encapsulation.object;

public class PrintService {
    public void info(Client client, double price, double priceDiscount) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (firstName != null && lastName == null)
            System.out.println("Witaj " + firstName);
        else if (firstName != null && lastName != null)
            System.out.println("Witaj " + firstName + " " + lastName);
        else if (firstName == null && lastName != null)
            System.out.println("Dzień dobry panie/pani " + lastName);
        else
            System.out.println("Witaj nieznajomy");
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}
