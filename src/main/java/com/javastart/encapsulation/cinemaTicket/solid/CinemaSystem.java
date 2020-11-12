package com.javastart.encapsulation.cinemaTicket.solid;

public class CinemaSystem {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", 15);
        Client client2 = new Client("Anna", "zalewska", 19);

       TicketSystem ticketSystem = new TicketSystem();

        Seance seance1 = new Seance("Omen", 128,"horror", 16, 72, 72);
        Ticket ticket1 = ticketSystem.createTicket(seance1, client1);

        Ticket ticket2 = ticketSystem.createTicket(seance1, client2);

        seance1.ticketCheck(client1, ticket1);
        seance1.ticketCheck(client2, ticket2);
        seance1.seanceInfo();
    }
}
