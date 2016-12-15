package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public abstract class CalculableTheAreaAndLengthOfTheCircle implements CalculableTheAreaOfTheCircle,
        CalculableTheLengthOfTheCircle {

    private static final double Pi = 3.14159265359;

    @Override
    public double calculateTheAreaOfTheCircle(double radius) {
        double area = Pi * (Math.pow(radius, 2));
        return area;
    }

    @Override
    public double calculateTheLengthOfThtCircle(double radius) {
        double length = 2 * Pi * radius;
        return length;
    }
}
