package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 30-Jan-17.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 30.01.2017
 *
 * Interface "Calculable" declares the contract for the implementation of the calculation.
 */
public interface Сalculable<T> {

    /**
    * Is necessary to implement this method to perform the calculation.
     *
     * @since 30.01.2017
     * @param t An object that encapsulates for calculation.
    * */
    T calculate(T t);

    /**
     *  Is necessary to implement this method to perform the calculation.
     *
     *  @since 30.01.2017
     *  @param tFirst The first parameter for calculation.
     *  @param tSecond The first parameter for calculation.
     * */
    T calculate(T tFirst, T tSecond);
}
