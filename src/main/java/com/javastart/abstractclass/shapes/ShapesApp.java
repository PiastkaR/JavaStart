package com.javastart.abstractclass.shapes;

import java.util.NoSuchElementException;

public class ShapesApp {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Shape shape = null;

        boolean readComplete = false;

        while (!readComplete) {
            try {
                printOptions();
                shape = shapeCalculator.createShape();
                readComplete = true;
            } catch (NoSuchElementException exception) {
                System.out.println("wrong format try again! ");
            } finally {
                shapeCalculator.clearBuffer();
            }
        }

//        System.out.println(shape.toString());
        shape.shapeInfo();

        shapeCalculator.closeScanner();
    }

    private static void printOptions() {
        System.out.println("Choose figure ");
        System.out.println(Shape.RECTANGLE + " - rectangle");
        System.out.println(Shape.CIRCLE + " - circle");
        System.out.println(Shape.TRIANGLE + " - triangle");
    }
}
