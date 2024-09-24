package org.javacode.utils;

import org.javacode.shapes.Shape;

public class GeometryUtils {

    public double areaDifference(Shape shape1, Shape shape2) {
        double area1 = shape1.getArea();
        double area2 = shape2.getArea();
        return area1 > area2 ? area1 - area2 : area2 - area1;
    }

    public double convertCmToMm(double cm) {
        return cm * 10;
    }

    public double convertMmToCm(double mm) {
        return mm / 10;
    }

}
