package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.util.calculating.CalculatingData
 * @see com.lugowoy.util.calculating.Calculable
 * @see com.lugowoy.util.calculating.CalculableOnTheObject
 * <p>
 * The class inherits functionality from the class "CalculatingData"
 * to ensure the implementation of functions for calculations on the object.
 * Implements functional interface "CalculableOnTheObject" for the calculation of on the object.
 * Class delegates the duty of performing calculation functions.
 * @since 01.02.2017
 */
public class CalculatingDataOnTheObject<T> extends CalculatingData<T> implements CalculableOnTheObject<T> {

    /**
     * Constructor class takes as argument realization calculating function.
     *
     * @param calculableOnTheObject The object or method implementation the function for calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheObject
     * @see com.lugowoy.util.calculating.CalculatingData
     * @since 30.01.2017
     */
    public CalculatingDataOnTheObject(CalculableOnTheObject<T> calculableOnTheObject) {
        super(calculableOnTheObject);
    }

    /**
     * Implementation of the method for calculations using the field object passed argument.
     *
     * @param t The object passed argument. Data from this object will be used to check the calculate.
     * @return The object encapsulates the data after calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheObject
     * @since 30.01.2017
     */
    @SuppressWarnings("unchecked")
    @Override
    public T calculate(T t) {
        return ((CalculableOnTheObject<T>) super.getCalculable()).calculate(t);
    }
}
