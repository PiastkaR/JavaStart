package com.javastart.abstractclass.salary;

public class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }

    @Override
    public double getYearSalary() {
        return 1.05 * (12 * getMonthSalary());
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("salary is: ");
        sb.append(salary);

        return sb;
    }
}
