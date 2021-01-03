package com.javastart.wrappers.sum;

import java.math.BigInteger;

public class Calculator {
    public int addInts(int one, int two, int three) {
        return one + two + three;
    }

    public BigInteger addBigInts(BigInteger one, BigInteger two) {
        return one.add(two);
    }
}
