package com.javastart.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
                //zeby plik byl do odczytania musi byc zparsowany! naleazy zwsze uzywac metod tego samego typu tj. file reader/ writer. object reader/writer
        ) {
            p1 = (Person) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Nie udało się odczytać pliku");
            e.printStackTrace();
        }

        if (p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
        }
    }
}