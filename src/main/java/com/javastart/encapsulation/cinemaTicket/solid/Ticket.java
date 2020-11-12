package com.javastart.encapsulation.cinemaTicket.solid;

public class Ticket {
    private int ticketId;
    private Seance seance;
    private Client client;

    public Ticket(int ticketId, Seance seance, Client client) {
        this.ticketId = ticketId;
        this.seance = seance;
        this.client = client;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
