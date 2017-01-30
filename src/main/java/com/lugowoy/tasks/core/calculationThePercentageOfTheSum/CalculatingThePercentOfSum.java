package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import java.math.BigDecimal;
import com.lugowoy.util.calculating.Сalculable;

/**
 * Created by Konstantin on 04-Jan-17.
 */

public class CalculatingThePercentOfSum implements Сalculable<Variable> {

    @Override
    public Variable calculate(Variable variable) {
        Double valuePercent = (variable.getPartOfSum()).doubleValue() / variable.getSum().doubleValue() * 100;
        variable.setPercent(new BigDecimal(valuePercent));
        return variable;
    }
}
