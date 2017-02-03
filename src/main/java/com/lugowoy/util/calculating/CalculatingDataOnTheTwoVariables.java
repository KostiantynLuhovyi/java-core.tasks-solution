package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.util.calculating.CalculatingData
 * @see com.lugowoy.util.calculating.Calculable
 * @see com.lugowoy.util.calculating.CalculableOnTheTwoVariables
 * <p>
 * The class inherits functionality from the class "CalculatingData"
 * to ensure the implementation of functions for calculations on the two variables.
 * Implements functional interface "CalculableOnTheTwoVariables" for the calculation of on the two variables.
 * Class delegates the duty of performing calculation functions.
 * @since 01.02.2017
 */
public class CalculatingDataOnTheTwoVariables<T> extends CalculatingData<T> implements CalculableOnTheTwoVariables<T> {

    /**
     * Constructor class takes as argument realization calculating function.
     *
     * @param calculableOnTheTwoVariables The object or method implementation the function for calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheTwoVariables
     * @see com.lugowoy.util.calculating.CalculatingData
     * @since 01.02.2017
     */
    public CalculatingDataOnTheTwoVariables(CalculableOnTheTwoVariables<T> calculableOnTheTwoVariables) {
        super(calculableOnTheTwoVariables);
    }

    /**
     * Implementation of the method for calculations using three variables passed argument.
     *
     * @param tFirst  The variable for calculations.
     * @param tSecond The variable for calculations.
     * @return The result of calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheTwoVariables
     * @since 01.02.2017
     */
    @SuppressWarnings("unchecked")
    @Override
    public T calculate(T tFirst, T tSecond) {
        return ((CalculableOnTheTwoVariables<T>) super.getCalculable()).calculate(tFirst, tSecond);
    }
}
