package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 30-Jan-17.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 30.01.2017
 *
 * Functional interface declares a function to perform the calculation.
 */
@FunctionalInterface
public interface Calculating<T> {

    /**
     * Method to calculation.
     * */
    T calculate(T t);
}
