package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 14.12.2016
 *
 * Functional interface provides access to the implementation of the functional construction of a number of degree.
 */
@FunctionalInterface
public interface CalculateTheDegreeOfNumber {

    /**
    * The method of performing the the construction number of a degree.
    * @param number The number for exponentiation.
    * @param degree Degree
    * @return The result of a number of a degree .
    * */
    double calculateDegreeOfNumber(double number, double degree);
}
