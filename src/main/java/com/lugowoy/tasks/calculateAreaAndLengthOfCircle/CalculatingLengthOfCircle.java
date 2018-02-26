package com.lugowoy.tasks.calculateAreaAndLengthOfCircle;

import static java.lang.Math.PI;

/** Created by Konstantin Lugowoy on 01-Feb-17. */

public interface CalculatingLengthOfCircle {

    static Circle calculateTheLengthOfTheCircle(Circle circle) throws IllegalArgumentException {
        if (circle != null) {
            try {
                circle.setLength(2 * PI * circle.getRadius());
            } catch (IllegalArgumentException ex) {
                System.err.println(ex.getMessage());
            }
        } else {
            throw new IllegalArgumentException(
                    new NullPointerException("The object of Circle class passed by argument is equal to null."));
        }
        return circle;
    }

}
