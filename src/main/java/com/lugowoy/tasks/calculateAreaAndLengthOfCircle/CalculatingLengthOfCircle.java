package com.lugowoy.tasks.calculateAreaAndLengthOfCircle;

import static java.lang.Math.PI;

/** Created by Konstantin Lugowoy on 01-Feb-17. */

public interface CalculatingLengthOfCircle {

    static Circle calculateTheLengthOfTheCircle(Circle circle) {
        try {
            if (circle != null) {
                circle.setLength(2 * PI * circle.getRadius());
            } else {
                throw new IllegalArgumentException(
                           new NullPointerException("The object of Circle class passed by argument is equal to null."));
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return circle;
    }

}
