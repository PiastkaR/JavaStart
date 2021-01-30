package com.javastart.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DatePatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tworzę nowe wydarzenie.");
        System.out.println("Podaj rok, miesiac, dzien");

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateInput = sc.nextLine();
        LocalDate createdDate = LocalDate.parse(dateInput, datePattern);

//        LocalDate createdDate = LocalDate.of(year, month, day);
        System.out.println("Wydarzenie utworzone na dzień " + createdDate);
    }
}