package com.javastart.encapsulation.cinemaTicket.solid;

class TicketSystem {
    Ticket createTicket(Seance movieShow, Client client){
        if (!movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na wskazany seans");
            return null;
        } else if (!clientHasRequiredAgeForMovie(client, movieShow)) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = generateNextTicketId(movieShow);
            movieShow.decreaseFreeSeatsNumber();
            return new Ticket(ticketId, movieShow, client);
        }
    }

    private int generateNextTicketId(Seance movieShow) {
        return movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
    }

    private boolean clientHasRequiredAgeForMovie(Client client, Seance movieShow) {
        return client.getAge() >= movieShow.getAgeRequired();
    }
}