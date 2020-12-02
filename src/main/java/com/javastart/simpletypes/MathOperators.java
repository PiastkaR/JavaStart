package com.javastart.simpletypes;

public class MathOperators {
    public static void main(String[] args) {
        int x = 10;
        double y = 4.0;
        int number = 9;
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        y = y * 5;
        x += 2;
        System.out.println(y);
        System.out.println(x);
        boolean xEqualsY = x == y;
        System.out.println(xEqualsY);//false
        System.out.println(!xEqualsY);
        number++;
        System.out.println(number); //++ inkrementacje zwiekszamy o 1 to smao co number +=number..
        /////////////////////////////////////////////////////////////////////
        int myTestNumber = 8;
        System.out.println(myTestNumber);
        System.out.println(myTestNumber += myTestNumber);
        System.out.println(myTestNumber++);//tu bedzie znowu 16 bo ++ a nie +=
        System.out.println(myTestNumber--);//tu bedzie 17 dopiero..
        System.out.println(myTestNumber);
        System.out.println(--myTestNumber);
        System.out.println(myTestNumber);

    }
}
