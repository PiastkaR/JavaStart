package com.javastart.dateandtime.cpmparedates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CompareDatesApp {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter two dates in format yyyy-MM-dd");
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        LocalDate date1 = null;
        LocalDate date2 = null;

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            date1 = LocalDate.parse(line1, formatter);
            date2 = LocalDate.parse(line2, formatter);

        } catch (DateTimeParseException e) {
            System.out.println("Incorrect date format!");
        }
        LocalDate localDate = date1.isAfter(date2) ? date1 : date2;
        System.out.println("Later date from " + date1 + " and " + date2 + " is: " + localDate);

        Period between = Period.between(date1, date2);
        int days = Math.abs(between.getDays());
        int months = Math.abs(between.getMonths());
        int years = Math.abs(between.getYears());
        System.out.println(String.format("Years: '%s', months: '%s' and days: '%s' between them.", years, months, days));
    }
}
