package com.javastart.serialization.client;

import java.io.Serializable;

public class Client implements Serializable {
    private int id;
    private String firstname;
    private String lastName;
    private String country;
    private double value;

    public Client(int id, String firstname, String lastName, String country, double value) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.country = country;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return id + " " + firstname + " " + lastName + " " + country + " " + value + "zl";
    }
}
