
package com.javastart.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scan = new Scanner(file);

        int lines = 0;
        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        scan.close();
    }
}