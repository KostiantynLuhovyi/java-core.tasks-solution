package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

/**
 * Created by Konstantin on 15-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 15.12.2016
 * <p>
 * This class encapsulates attributes of the circle.
 */
public class Circle {

    /**
     * Field class declares radius of the circle.
     */
    private double radius;
    /**
     * Field class declaring area of the circle.
     */
    private double area;
    /**
     * Field class declaring length of the circle.
     */
    private double length;

    /**
     * Default constructor.
     */
    public Circle() {
    }

    /**
     * Get radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set radius of the circle.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get area of the circle.
     */
    public double getArea() {
        return area;
    }

    /**
     * Set area of the circle.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Get length of the circle.
     */
    public double getLength() {
        return length;
    }

    /**
     * Set length of the circle.
     */
    public void setLength(double length) {
        this.length = length;
    }
}
