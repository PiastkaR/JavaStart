package com.javastart.abstractclass.shapes;

public interface Shape {
    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

    double PI = 3.1415;

    double perimeter();

    double area();

    default void shapeInfo() {
        System.out.println("Perimeter is: " + perimeter() + " Area: " + area());
    }
}
