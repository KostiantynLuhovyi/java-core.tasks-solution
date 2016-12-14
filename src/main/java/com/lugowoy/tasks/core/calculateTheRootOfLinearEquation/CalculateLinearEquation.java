package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import org.jetbrains.annotations.Contract;

/**
 * Created by Konstantin on 14-Dec-16.
 */

public class CalculateLinearEquation implements CalculableLinearEquation {


    @Override
    public LinearEquation getCalculateXRootLinearEquation(LinearEquation equation) {
        if ((equation.getA() == 0) && (equation.getB() == 0)) {
            System.out.println("Linear equation have many solutions");
        } else if ((equation.getA() == 0) && (equation.getB() != 0)) {
            System.out.println("Linear equation not have solutions");
        } else if ((equation.getA() != 0) && (equation.getB() != 0)) {
            equation.setXRootLinearEquation(-(equation.getB()/equation.getA()));
        }
        return equation;
    }

}
