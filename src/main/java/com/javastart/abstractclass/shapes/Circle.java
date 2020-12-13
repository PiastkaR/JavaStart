package com.javastart.abstractclass.shapes;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void shapeInfo() {
        System.out.println("Circle circumference: " + (int) perimeter() + " area " + area());
    }
}
