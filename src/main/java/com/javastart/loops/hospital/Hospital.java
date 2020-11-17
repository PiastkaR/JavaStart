package com.javastart.loops.hospital;

public class Hospital {
    private final int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int registeredPatients = 0;

    public void addPatient(Patient patient) {
        if (registeredPatients < maxPatientsNumber) {
            patients[registeredPatients] = patient;
            registeredPatients++;
        }
    }

    public void printPatients() {
        for (int i = 0; i < registeredPatients; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPesel());
        }
//        for (Patient patient : patients) { //TODO WAZNE: przy sztywno zainicjalizowanej liscie jak tu on chce leciec po elementach ktore sa NULLEM!
//            System.out.println(patient.getLastName());
//        }
    }
}
