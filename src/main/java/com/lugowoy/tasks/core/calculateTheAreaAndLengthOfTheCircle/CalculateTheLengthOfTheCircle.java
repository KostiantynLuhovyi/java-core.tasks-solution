package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import static java.lang.Math.PI;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.2
 * @see com.lugowoy.util.calculable.CalculableOnTheObject
 * @since 01.02.2017
 * <p>
 * Implements calculation of finding the length of a circle.
 */
public class CalculateTheLengthOfTheCircle {

    /**
     * Override method with "CalculableOnTheObject" interface to calculateTheAreaOfTheCircle the length of the circle.
     *
     * @param circle The class object "Circle" encapsulating data to calculateTheAreaOfTheCircle length.
     * @return The class object of the "Circle" to set the result of calculating the length of a circle.
     * @see com.lugowoy.util.calculable.CalculableOnTheObject
     * @since 01.02.2017
     */
    public Circle calculateTheLengthOfTheCircle(Circle circle) {
        /*
        * Calculating the length of the circle knowing the radius of the formula "P = 2πr"
        * */
        circle.setLength(2 * PI * circle.getRadius());
        return circle;
    }

}
