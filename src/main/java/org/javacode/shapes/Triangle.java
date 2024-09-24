package org.javacode.shapes;

public class Triangle {

    private final double base;
    private final double height;
    private final double side1;
    private final double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(double base, double side1, double side2) {
        this.base = base;
        this.height = 0;
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.side1 = 0;
        this.side2 = 0;
    }


    public double getArea() {
        return (base * height) / 2;
    }

    public double getPerimeter() {
        return base + side1 + side2;
    }
}
