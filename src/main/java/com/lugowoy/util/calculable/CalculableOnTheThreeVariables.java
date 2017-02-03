package com.lugowoy.util.calculable;

/**
 * Created by Konstantin Lugowoy on 03-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 03.02.2017
 * <p>
 * Functional interface declares a contract for calculations using the three variables.
 */
@FunctionalInterface
public interface CalculableOnTheThreeVariables<T> {

    /**
     * The method(function) of performing calculations on the value of the three variables.
     *
     * @param tFirst  The first variable for calculate.
     * @param tSecond The second variable for calculate.
     * @param tThird  The third variable for calculate.
     * @return The result of the calculation.
     * @since 03.02.2017
     */
    T calculate(T tFirst, T tSecond, T tThird);
}
