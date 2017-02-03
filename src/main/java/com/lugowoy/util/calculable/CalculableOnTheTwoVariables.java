package com.lugowoy.util.calculable;

/**
 * Created by Konstantin Lugowoy on 03-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 03.02.2017
 * <p>
 * Functional interface declares a contract for calculations using the two variables.
 */
@FunctionalInterface
public interface CalculableOnTheTwoVariables<T> {

    /**
     * The method(function) of performing calculations on the value of the two variables.
     *
     * @param tFirst  The first variable for calculate.
     * @param tSecond The second variable for calculate.
     * @return The result of the calculation.
     * @since 03.02.2017
     */
    T calculate(T tFirst, T tSecond);
}
