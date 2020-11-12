package com.javastart.sysin.flipacoin;

import java.util.Random;

public class RandFlip {
    Random random = new Random();

    public int flip() {
        return random.nextInt(1);
    }
}
