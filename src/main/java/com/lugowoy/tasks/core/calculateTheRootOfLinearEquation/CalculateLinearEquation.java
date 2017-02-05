package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.3
 * @since 14.12.2016
 * <p>
 * This class implements the functionality for calculating the root of the linear equation.
 */
public class CalculateLinearEquation {

    /**
     * Implements for calculating the root of a linear equation.
     *
     * @param equation Linear equation.
     * @return The result will be the object of a linear equation
     *          with the assigned value in the field of the root of the linear equation.
     * @since 14.12.2016
     */
    public LinearEquation getRootOfTheLinearEquation(LinearEquation equation) {
        if ((equation.getA() == 0) && (equation.getB() == 0)) {
            System.out.println("Linear equation have many solutions");
        } else if ((equation.getA() == 0) && (equation.getB() != 0)) {
            System.out.println("Linear equation not have solutions");
        } else if ((equation.getA() != 0) && (equation.getB() != 0)) {
            equation.setXRootLinearEquation(-(equation.getB() / equation.getA()));
        }
        return equation;
    }
}
