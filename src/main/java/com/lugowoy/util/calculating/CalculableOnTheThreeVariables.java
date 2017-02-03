package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.util.calculating.Calculable
 * <p>
 * Functional interface for the implementation of the calculations on the three varibles.
 * @since 01.02.2017
 */
@FunctionalInterface
public interface CalculableOnTheThreeVariables<T> extends Calculable<T> {
    /**
     * The implementation of this method determines that calculations
     * will be produced with variables passed as an argument to the method.
     *
     * @param tFirst  The variable for calculations
     * @param tSecond The variable for calculations
     * @param tThird  The variable for calculations
     * @return The result of the calculation.
     * @since 01.02.2017
     */
    T calculate(T tFirst, T tSecond, T tThird);
}
