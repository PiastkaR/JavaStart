package com.javastart.streams.soccer;

public class FootballMatch {
    private String hosts;
    private String guests;
    private int goalsByHosts;
    private int goalsByGuests;

    public FootballMatch(String hosts, String guests, int goalsByHosts, int goalsByGuests) {
        this.hosts = hosts;
        this.guests = guests;
        this.goalsByHosts = goalsByHosts;
        this.goalsByGuests = goalsByGuests;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public String getGuests() {
        return guests;
    }

    public void setGuests(String guests) {
        this.guests = guests;
    }

    public int getGoalsByHosts() {
        return goalsByHosts;
    }

    public void setGoalsByHosts(int goalsByHosts) {
        this.goalsByHosts = goalsByHosts;
    }

    public int getGoalsByGuests() {
        return goalsByGuests;
    }

    public void setGoalsByGuests(int goalsByGuests) {
        this.goalsByGuests = goalsByGuests;
    }

    int getGoalDifference() {
        return goalsByHosts - goalsByGuests;
    }

    int getGoalSum() {
        return goalsByGuests + goalsByHosts;
    }

    @Override
    public String toString() {
        return "Match{" +
                "hosts='" + hosts + '\'' +
                ", guests='" + guests + '\'' +
                ", goalsHosts=" + goalsByHosts +
                ", goalsGuestes=" + goalsByGuests +
                '}';
    }
}
