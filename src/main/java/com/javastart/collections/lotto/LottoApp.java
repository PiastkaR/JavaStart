package com.javastart.collections.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoApp {
    public static void main(String[] args) {
        System.out.println("Welcome to lotto!");
        List<Integer> userNumbers = readNumbersFromUser();
        Lotto lotto = new Lotto();
        int result = lotto.checkResult(userNumbers);
        List<Integer> lottoResult = lotto.getLottoResult();
        System.out.println("Your numbers: " + userNumbers);
        System.out.println("Result: " + lottoResult);
        System.out.println("Get: " + result);
    }

    private static List<Integer> readNumbersFromUser() {
        List<Integer> userNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Lotto.MAX_NUMBERS; i++) {
            System.out.println("Please input next number.");
            int nextNumber = input.nextInt();
            userNumbers.add(nextNumber);
        }
        return userNumbers;
    }
}

