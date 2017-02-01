package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.calculating.Сalculable;

import static java.lang.Math.PI;

/**
 * Created by Konstantin on 15-Dec-16.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 15.12.2016
 *
 * Implements calculation of finding the area of a circle.
 *
 * @see com.lugowoy.util.calculating.Сalculable
 */

public class CalculateTheAreaOfTheCircle implements Сalculable<Double>{

    /**
     * The method calculates the area of the circle.
     * @since 01.02.2017
     * @param radius Radius of the circle.
     * */
    @Override
    public Double calculate(Double radius) {
        return PI * Math.pow(radius, 2);
    }

    /**
     * The method calculates the area of the circle.
     * @since 01.02.2017
     * @param radius Radius of the circle.
     * @param two Number "2" to calculate the area of the circle
     * */
    @Override
    public Double calculate(Double radius, Double two) {
        return PI * Math.pow(radius, two);
    }
}
