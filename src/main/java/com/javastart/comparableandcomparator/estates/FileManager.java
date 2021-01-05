package com.javastart.comparableandcomparator.estates;

import java.io.*;
import java.util.Scanner;

public class FileManager implements Serializable {

    public EstateAgency readLocalFile(String fileName) {
        try (
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (EstateAgency) ois.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            throw new FileImportException(fileName);
        }
    }

    public EstateAgency readFile(String fileName) {
        int fileLines = countFileLines(fileName);
//        Estate[] estates = new Estate[fileLines];
        EstateAgency estateAgency = new EstateAgency(new Estate[fileLines]);
        try (
                Scanner scanner = new Scanner(new File(fileName))
        ) {
            scanner.nextLine();//skip header
            for (int i = 0; i <= fileLines; i++) {
                String line = scanner.nextLine();
                estateAgency.addEstate(createEstate(line));//[i] = createEstate(line);
            }

        } catch (FileNotFoundException e) {
            throw new FileImportException(fileName);
        }
        return estateAgency;
    }

    private int countFileLines(String fileName) {
        int fileLines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                fileLines++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileLines;
    }

    private Estate createEstate(String line) {
        String[] data = line.split(";");
        String city = data[0];
        double price = Double.parseDouble(data[1]);
        double squareMeters = Double.parseDouble(data[2]);
        return new Estate(city, price, squareMeters);
    }
}
