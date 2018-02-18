package com.lugowoy.tasks.calculateTheAreaAndLengthOfTheCircle;

import java.io.Serializable;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public class Circle implements Serializable, Cloneable {

    private double radius;
    private double area;
    private double length;

    public Circle() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                Double.compare(circle.getArea(), getArea()) == 0 &&
                Double.compare(circle.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getArea(), getLength());
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", area=" + area +
                ", length=" + length +
                ']';
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        circle.setRadius(this.getRadius());
        circle.setArea(this.getArea());
        circle.setLength(this.getLength());
        return circle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("The value of radius passed of argument is less than or equal to 0.");
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) throws IllegalArgumentException {
        if (area > 0) {
            this.area = area;
        } else {
            throw new IllegalArgumentException("The value of area passed by argument is less than or equal to 0.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalArgumentException {
        if (length > 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("The value of length passed by argument is less than or equal to 0.");
        }
    }

}
