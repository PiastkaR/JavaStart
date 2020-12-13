package com.javastart.exceptions.competition;

class Competition {
    private String name;
    private Participant[] participants;
    private int ageLimit;
    private int size;

    public Competition(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        if (ageLimit < 0) {
            throw new IllegalArgumentException("ageLimit has to be positive number");
        }
        this.ageLimit = ageLimit;
        this.participants = new Participant[maxParticipants];
    }

    void addParticipant(Participant participant) {
        if (participant.getAge() < ageLimit) {
            throw new AgeViolationException(String.format("Only participants above: '%s' are allowed.", ageLimit), ageLimit);
        }
        if (participants.length == size) {
            throw new MaxCompetitorsException(String.format("Max participants number was exceeded. Only: '%s' are allowed.", size), size);
        }
        for (Participant value : participants) {
            if (value.getDocumentId().equals(participant.getDocumentId()))
                throw new DuplicateException(String.format("Participant: '%s' already exist.", participant), participant);
        }

        participants[size] = participant;
        size++;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}