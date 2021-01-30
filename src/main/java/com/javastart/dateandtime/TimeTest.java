package com.javastart.dateandtime;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

class TimeTest {
    public static void main(String[] args) {
        Date date = new Date(1990, 10, 10); ///<- stare API
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));

        Instant i1 = Instant.now();
        for (int i = 0; i < 100; i++) {
            System.out.println("Miernik czasu");
        }
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Pętla wykonała się w : " + duration.getNano() + " nanosekund");
    }
}