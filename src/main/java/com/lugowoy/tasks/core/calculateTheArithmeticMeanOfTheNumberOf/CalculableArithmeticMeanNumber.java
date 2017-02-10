package com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin Lugowoy on 03-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 03.12.2016
 * <p>
 * Interface declares a contract to calculate the arithmetic mean of the values of an array of real numbers.
 */
@FunctionalInterface
public interface CalculableArithmeticMeanNumber {

    /**
     * The method for calculating the arithmetic mean of the values of an array of real numbers.
     *
     * @param doublesArray Array of real numbers.
     * @return The calculation result of the arithmetic mean value of the array of real numbers.
     */
    double calculateArithmeticMeanNumber(Double[] doublesArray);

}
