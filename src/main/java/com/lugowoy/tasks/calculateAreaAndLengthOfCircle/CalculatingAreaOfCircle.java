package com.lugowoy.tasks.calculateAreaAndLengthOfCircle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public interface CalculatingAreaOfCircle {

    static Circle calculateTheAreaOfTheCircle(Circle circle) {
        if (circle != null) {
            circle.setArea(PI * pow(circle.getRadius(), 2));
        } else {
            System.err.println("The object of Circle class passed by argument is equal to null.");
        }
        return circle;
    }

}
