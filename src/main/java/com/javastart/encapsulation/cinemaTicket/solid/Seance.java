package com.javastart.encapsulation.cinemaTicket.solid;

public class Seance {
    private String movieTitle;
    private String movieType;
    private int movieTime;
    private int ageRequired;
    private int maxSeats;
    private int freeSeats;

    public Seance(String movieTitle, int movieTime, String movieType, int ageRequired, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.movieType = movieType;
        this.movieTime = movieTime;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public void ticketCheck(Client client, Ticket ticket) {
        if (freeSeats == 0) {
            System.out.println("Brak wolnych miejsc na seans");
        } else if (client.getAge() < ageRequired) {
            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
        } else {
            ticket.setTicketId(1);
            ticket.setClient(client);
            movieTitle = "Omen";
            freeSeats--;
        }
    }

    public boolean hasFreeSeats() {
        return freeSeats != 0;
    }

    public void decreaseFreeSeatsNumber() {
        freeSeats--;
    }

    public void seanceInfo() {
        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(int movieTime) {
        this.movieTime = movieTime;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public void setAgeRequired(int ageRequired) {
        this.ageRequired = ageRequired;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }
}
