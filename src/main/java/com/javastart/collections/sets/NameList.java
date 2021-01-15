package com.javastart.collections.sets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class NameList {
    private static final String FILE_NAME = "namespl.txt";

    public static void main(String[] args) throws IOException {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        TreeSet<String> treeSet = readFile(names);

        System.out.println(treeSet);
    }

    private static TreeSet<String> readFile(TreeSet<String> names) throws IOException {
        try (
                var br = new BufferedReader(new FileReader(FILE_NAME))
        ) {
            while (br.readLine() != null) {
                String line = br.readLine();
                names.add(line);
            }
            System.out.println("Names in set: " + names.size());
            System.out.println("First name: " + names.first());
            System.out.println("Last name: " + names.last());
        } catch (FileNotFoundException exception) {
            System.err.println("Error while reading a file! ");
        }
        return names;
    }
}
