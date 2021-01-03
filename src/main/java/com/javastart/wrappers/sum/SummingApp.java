package com.javastart.wrappers.sum;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class SummingApp {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
//        BigInteger[] numbers = fm.readFile("numbers.s");

        try (
                var fr = new FileReader("numbers.s");
                var br = new BufferedReader(fr);
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger aBig = new BigInteger(br.readLine());
            BigInteger bBig = new BigInteger(br.readLine());
            System.out.println("a+b+c = " + (a + b + c));
            System.out.println("aBig+bBig = " + aBig.add(bBig));
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.err.println("Błąd odczytu danych");
        }
    }
}
