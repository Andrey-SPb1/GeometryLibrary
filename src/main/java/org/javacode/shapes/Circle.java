package org.javacode.shapes;

public class Circle {

    public double getArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double getPerimeter(double r) {
        return Math.PI * r * 2;
    }
}
