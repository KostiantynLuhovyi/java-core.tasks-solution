package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.util.calculating.Calculable
 * <p>
 * Functional interface for the implementation of the calculations on the object.
 * @since 01.02.2017
 */
@FunctionalInterface
public interface CalculableOnTheObject<T> extends Calculable<T> {
    /**
     * The implementation of this method determines that the calculations
     * will be produced with the fields of the object passed as an argument.
     *
     * @param t The object with the fields which will be conducted calculate.
     * @return The object encapsulates the data
     * obtained as a result of calculations using data that contains the object passed in the argument.
     * @since 01.02.2017
     */
    T calculate(T t);
}
