package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.calculating.Сalculable;

/**
 * Created by Konstantin on 14-Dec-16.
 * @author Konstantin
 * @version 1.1
 * @since 1.0
 */

public class CalculateLinearEquation implements Сalculable<LinearEquation> {

    @Override
    public LinearEquation calculate(LinearEquation equation) {
        if ((equation.getA() == 0) && (equation.getB() == 0)) {
            System.out.println("Linear equation have many solutions");
        } else if ((equation.getA() == 0) && (equation.getB() != 0)) {
            System.out.println("Linear equation not have solutions");
        } else if ((equation.getA() != 0) && (equation.getB() != 0)) {
            equation.setXRootLinearEquation(-(equation.getB()/equation.getA()));
        }
        return equation;
    }

    @Override
    public LinearEquation calculate(LinearEquation tFirst, LinearEquation tSecond) {
        throw new RuntimeException("Not realization.");
    }
}
