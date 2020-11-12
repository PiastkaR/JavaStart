package com.javastart.sysin.flipacoin;

import java.util.Locale;
import java.util.Scanner;

public class CoinApp {
    public static void main(String[] args) {
        System.out.println("Give your bet  0 - Eagle 1 - Tail.");
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        int bet = input.nextInt();

        RandFlip flip = new RandFlip();
        if(flip.flip() == bet){
            System.out.println("Your bet was good!");
        } else {
            System.out.println("Not this time...");
        }
    }
}
