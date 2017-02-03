package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 01-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.util.calculating.CalculatingData
 * @see com.lugowoy.util.calculating.Calculable
 * @see com.lugowoy.util.calculating.CalculableOnTheThreeVariables
 * <p>
 * The class inherits functionality from the class "CalculatingData"
 * to ensure the implementation of functions for calculations on the three variables.
 * Implements functional interface "CalculableOnTheThreeVariables" for the calculation of on the three variables.
 * Class delegates the duty of performing calculation functions.
 * @since 01.02.2017
 */
public class CalculatingDataOnTheThreeVariables<T> extends CalculatingData<T> implements CalculableOnTheThreeVariables<T> {

    /**
     * Constructor class takes as argument realization calculating function.
     *
     * @param calculableOnTheThreeVariables The object or method implementation the function for calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheThreeVariables
     * @see com.lugowoy.util.calculating.CalculatingData
     * @since 01.02.2017
     */
    public CalculatingDataOnTheThreeVariables(CalculableOnTheThreeVariables<T> calculableOnTheThreeVariables) {
        super(calculableOnTheThreeVariables);
    }

    /**
     * Implementation of the method for calculations using three variables passed argument.
     *
     * @param tFirst  The variable for calculations.
     * @param tSecond The variable for calculations.
     * @param tThird  The variable for calculations.
     * @return The result of calculation.
     * @see com.lugowoy.util.calculating.CalculableOnTheThreeVariables
     * @since 01.02.2017
     */
    @SuppressWarnings("unchecked")
    @Override
    public T calculate(T tFirst, T tSecond, T tThird) {
        return ((CalculableOnTheThreeVariables<T>) super.getCalculable()).calculate(tFirst, tSecond, tThird);
    }
}
