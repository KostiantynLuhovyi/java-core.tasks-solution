package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

/**
 * Created by Konstantin on 15-Dec-16.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 15.12.2016
 *
 * This class encapsulates attributes of the circle.
 */

public class Circle {

    private double radius;
    private double area;
    private double length;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
