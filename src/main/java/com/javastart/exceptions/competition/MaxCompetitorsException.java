package com.javastart.exceptions.competition;

public class MaxCompetitorsException extends RuntimeException {
    private int maxParticipants;

    public MaxCompetitorsException(String message, int maxParticipants) {
        super(message);
        this.maxParticipants = maxParticipants;
    }
}
