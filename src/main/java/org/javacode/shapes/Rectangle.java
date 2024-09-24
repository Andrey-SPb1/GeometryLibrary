package org.javacode.shapes;

public class Rectangle implements Shape {

    private final double width;
    private final double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }
}
