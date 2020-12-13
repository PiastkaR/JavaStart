package com.javastart.abstractclass.shapes;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void closeScanner() {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Give sides length: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Give circle radius: ");
        double radius = sc.nextDouble();

        return new Circle(radius);
    }

    private Triangle readTriangleData() {
        System.out.println("Give triangle basis and height: ");
        double basis = sc.nextDouble();
        double height = sc.nextDouble();

        return new Triangle(basis, height);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        switch (shapeType) {
            case Shape.RECTANGLE:
                return readRectangleData();
            case Shape.CIRCLE:
                return readCircleData();
            case Shape.TRIANGLE:
                return readTriangleData();
            default:
                throw new NoSuchElementException();
        }
    }

    public void clearBuffer() {
        sc.nextLine();
    }
}
