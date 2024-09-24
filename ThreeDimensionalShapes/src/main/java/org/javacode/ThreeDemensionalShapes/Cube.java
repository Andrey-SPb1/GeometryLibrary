package org.javacode.ThreeDemensionalShapes;

public class Cube implements ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return Math.pow(side, 3);
    }

    public double surfaceArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Cube: " +
                "side = " + side +
                ", volume = " + volume() +
                ", surface area = " + surfaceArea();
    }
}
