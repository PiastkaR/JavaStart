package com.javastart.abstractclass.shapes;

public class Triangle implements Shape {
    private double basis;
    private double height;

    public Triangle(double basis, double height) {
        this.basis = basis;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 3 * basis;
    }

    @Override
    public double area() {
        return 0.5 * basis * height;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Triangle");
        stringBuilder.append("perimeter: " + perimeter());
        stringBuilder.append(" area: " + area());

        return super.toString();
    }
}
