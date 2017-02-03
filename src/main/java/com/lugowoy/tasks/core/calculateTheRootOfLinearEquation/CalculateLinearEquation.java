package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.2
 * @since 14.12.2016
 * <p>
 * This class implements the functionality for calculating the root of the linear equation.
 */

public class CalculateLinearEquation {

    /**
     * Implements finding the root of a linear equation.
     *
     * @param equation Linear equation.
     * @return The linear equation which contains the object attribute the result of finding the root.
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
