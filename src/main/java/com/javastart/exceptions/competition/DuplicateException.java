package com.javastart.exceptions.competition;

public class DuplicateException extends RuntimeException {
    private Participant participant;

    public DuplicateException(String message, Participant participant) {
        super(message);
        this.participant = participant;
    }
}
