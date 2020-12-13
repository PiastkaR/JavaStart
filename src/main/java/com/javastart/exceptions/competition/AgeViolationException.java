package com.javastart.exceptions.competition;

public class AgeViolationException extends RuntimeException {
    private int ageLimit;

    public AgeViolationException(String message, int ageLimit) {
        super(message);
        this.ageLimit = ageLimit;
    }
}
