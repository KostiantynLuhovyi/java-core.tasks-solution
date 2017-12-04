package com.lugowoy.tasks.calculateTheAreaAndLengthOfTheCircle;

import static java.lang.Math.PI;

/** Created by Konstantin Lugowoy on 01-Feb-17. */

public interface CalculatingTheLengthOfTheCircle {

    static Circle calculateTheLengthOfTheCircle(Circle circle) {
        circle.setLength(2 * PI * circle.getRadius());
        return circle;
    }

}
