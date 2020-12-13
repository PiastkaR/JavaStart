package com.javastart.exceptions.competition;

public class AgeViolationException extends Exception {
    public AgeViolationException(int ageLimit, Exception exception) {
        super(String.format("The age limit is: %s ", ageLimit), exception);
    }
}
