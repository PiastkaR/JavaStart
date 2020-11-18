package com.javastart.access;

public class PointController {

    public void addX(Point p) {
        p.setX(p.getX() + 1);
        System.out.println("value of X is: " + p.getX());
    }

    public void minusX(Point p) {
        p.setX(p.getX() - 1);
        System.out.println("value of X is: " + p.getX());
    }

    public void addY(Point p) {
        p.setY(p.getY() + 1);
        System.out.println("value of Y is: " + p.getY());
    }

    public void minusY(Point p) {
        p.setY(p.getY() - 1);
        System.out.println("value of Y is: " + p.getY());
    }

}
