package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 14.12.2016
 * <p>
 * Functional interface declares a function of a number raised to a degree.
 */
@FunctionalInterface
public interface CalculateTheDegreeOfNumber {

    /**
     * This is a function to perform a number raised to a degree.
     *
     * @param number The number for raised of a degree.
     * @param degree The degree.
     * @return The result of a number of a degree .
     */
    double calculateDegreeOfNumber(double number, double degree);
}
