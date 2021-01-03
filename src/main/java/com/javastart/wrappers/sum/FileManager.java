package com.javastart.wrappers.sum;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class FileManager {
    private BigInteger[] numbers = new BigInteger[5];

    public BigInteger[] readFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);
            for (int i = 0; i < 4; i++) {
                String s = bf.readLine();
                numbers[i] = BigInteger.valueOf(Integer.parseInt(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    private int countFileLies(String fileName) {
        int counter = 0;
        try (
                var scanner = new Scanner(new File(fileName))
        ) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                counter++;
            }
        } catch (FileNotFoundException exception) {
            exception.getMessage();
        }
        return counter;
    }
}
