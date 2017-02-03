package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created by Konstantin on 15-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.3
 * @since 15.12.2016
 * <p>
 * Implements calculation of finding the area of a circle.
 */
public class CalculateTheAreaOfTheCircle {

    /**
     * Circle area calculation.
     *
     * @param circle The object circle encapsulates the data necessary to calculate the area of a circle.
     * @return The object containing the result of calculation range area of a circle.
     * @since 15.12.2016
     */
    public Circle calculateTheAreaOfTheCircle(Circle circle) {
        /*
        * Calculating the area of the circle knowing the radius of the formula "S = πr²".
        * To erect the square of the radius in a static class method Math pow().
        * */
        circle.setArea(PI * pow(circle.getRadius(), 2));
        return circle;
    }
}
