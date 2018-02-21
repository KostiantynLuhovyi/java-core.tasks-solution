package com.lugowoy.tasks.calculateTheAreaAndLengthOfTheCircle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public interface CalculatingTheAreaOfTheCircle {

    static Circle calculateTheAreaOfTheCircle(Circle circle) throws IllegalArgumentException {
        if (circle != null) {
            try {
                circle.setArea(PI * pow(circle.getRadius(), 2));
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
