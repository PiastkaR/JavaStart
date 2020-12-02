package com.javastart.polymorphyism.hospital;

public class Doctor extends Person {
    private int bonus;

    @Override
    public String getInfo() {
        return super.getInfo() + "Bonus: " + bonus;
    }

    public Doctor(String firstName, String lastName, int salary, int bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
