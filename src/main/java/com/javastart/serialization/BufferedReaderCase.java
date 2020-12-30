package com.javastart.serialization;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("person.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine(); //read nextLine
            }
        } catch (FileNotFoundException exception) {
            System.err.println("Exception occurred!" + exception);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        br.close();
    }
}
