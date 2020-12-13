package com.javastart.abstractclass.salery;

public class PartTimeEmployee extends Employee {
    private double hours;
    private double salaryPerHour;

    public PartTimeEmployee(String name, String surname, double hours, double salaryPerHour) {
        super(name, surname);
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public double getMonthSalary() {
        return hours * salaryPerHour;
    }

    @Override
    public double getYearSalary() {
        return 12 * getMonthSalary();
    }
}
