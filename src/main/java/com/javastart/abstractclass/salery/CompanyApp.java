package com.javastart.abstractclass.salery;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        Employee[] employees = company.createEmployees();
        company.printEmployees(employees);

        double totalSalaryMonth = company.getMonthSalaryForAllEmployees(employees);
        double totalSalaryYear = company.getYearSalaryForAllEmployees(employees);

        System.out.println("Month cost: " + totalSalaryMonth + " Year cost: " + totalSalaryYear);
    }
}
