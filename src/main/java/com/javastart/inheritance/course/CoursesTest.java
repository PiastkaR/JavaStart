package com.javastart.inheritance.course;

class CoursesTest {
    public static void main(String[] args) {
        OnlineCourse online = new OnlineCourse();
        online.setId("JAVA-ONLINE-123");
        online.setTitle("Kurs JavaStart Online");
        online.setDescription("Najlepszy kurs programowania w Javie");
        online.setPrice(299);
        online.setVideoLengthMin(600);
        online.setTimeToFinish(1200);
        System.out.println("Informacje o kursie " + online.getTitle());
        System.out.println("Opis: " + online.getDescription());
        System.out.println("Cena: " + online.getPrice() + "zł");
        System.out.println("Identyfikator: " + online.getId());
        System.out.println("Czas filmów w kursie: " + online.getVideoLengthMin() + "min");
        System.out.println("Czas potrzebny na przerobienie: " + online.getTimeToFinish() + "min");
    }
}