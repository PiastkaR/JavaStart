package com.javastart.polymorphyism.hospital;

public class HospitalApp {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Rafal", "Piastka", 5000, 500);
        Nurse nurse = new Nurse("Grazyna", "Zawadzka", 10000, 100);
        Nurse nurse2 = new Nurse("Janina", "Zablocka", 1000, 10);

        Hospital hospital = new Hospital();
        hospital.add(doctor);
        hospital.add(nurse);
        hospital.add(nurse2);

        hospital.getInfo();
    }
}
