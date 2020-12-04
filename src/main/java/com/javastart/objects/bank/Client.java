package com.javastart.objects.bank;

import java.util.Objects;

class Client {
    private String firstName;
    private String lastName;
    private String id;
    private Address address;

    public Client(String firstName, String lastName, String id, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id, address);
    }
}