package com.lugowoy.tasks.calculateAreaAndLengthOfCircle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public interface CalculatingAreaOfCircle {

    static Circle calculateTheAreaOfTheCircle(Circle circle) {
        try {
            if (circle != null) {
                circle.setArea(PI * pow(circle.getRadius(), 2));
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
