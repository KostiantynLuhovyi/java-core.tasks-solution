package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.calculating.Сalculable;

import static java.lang.Math.*;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 01.02.2017
 *
 * Implements calculation of finding the length of a circle.
 *
 * @see com.lugowoy.util.calculating.Сalculable
 */
public class CalculateTheLengthOfTheCircle implements Сalculable<Double> {

    /**
     * The method calculates the length of the circle.
     * @since 01.02.2017
     * @param radius Radius Of the circle.
     * */
    @Override
    public Double calculate(Double radius) {
        return 2 * PI * radius;
    }

    /**
     * The method calculates the length of the circle.
     * @since 01.02.2017
     * @param radius Radius of the circle.
     * @param two Number "2" to calculate length of the circle.
     * */
    @Override
    public Double calculate(Double radius, Double two) {
        return two * PI * radius;
    }
}
