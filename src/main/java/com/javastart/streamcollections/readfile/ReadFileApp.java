package com.javastart.streamcollections.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFileApp {
    private static final String FILE_NAME = "loremIpsum.txt";

    public static void main(String[] args) {
        List<String> file = readFile(FILE_NAME);
        System.out.println(file);
        System.out.println(file.size());

        long count = file.stream()
                .filter(word -> word.startsWith("s"))
                .count();

        System.out.println("Number of words starting with 's':" + count);

        long fiveLettersCount = file.stream()
                .filter(word -> word.length() == 5)
                .count();

        System.out.println("Number of words with 5 chars: " + fiveLettersCount);
    }

    private static List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        String tmp = null;
        try (
                var bufferedReader = new BufferedReader(new FileReader(fileName));
        ) {
            while ((tmp = bufferedReader.readLine()) != null) {
                lines.addAll(Arrays.asList(tmp.split(" ")));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return lines.stream()
                .map(word -> word.replaceAll("[.,]", ""))
                .collect(Collectors.toList());
    }

    //TODO lepsza wersja:
//    List<String> words = reader.lines()
//            .map(line -> line.split(" "))
//            .flatMap(Arrays::stream)
//            .map(s -> s.replaceAll(",", "").replaceAll("\\.", ""))
//            .collect(Collectors.toList());
}
