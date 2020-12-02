package com.javastart.polymorphyism.hospital;

public class Nurse extends Person {
    private double overtime;

    @Override
    public String getInfo() {
        return super.getInfo() + "Overtime: " + overtime;
    }

    public Nurse(String firstName, String lastName, int salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
