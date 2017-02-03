package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import java.math.BigDecimal;

/**
 * Created by Konstantin Lugowoy on 04-Jan-17.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 04.01.2017
 *
 * This class implements to calculation the percentage of the sum.
 */

public class CalculatingThePercentOfSum {

    /**
     * Method to calculating the percentage of the amount.
     * @param variable The object contains the value of variables to calculateTheAreaOfTheCircle.
     * @return The object containing the result of the calculation.
     * */
    public Variable calculateThePercentageOfTheSum(Variable variable) {
        Double valuePercent = (variable.getPartOfSum()).doubleValue() / variable.getSum().doubleValue() * 100;
        variable.setPercent(new BigDecimal(valuePercent));
        return variable;
    }
}
