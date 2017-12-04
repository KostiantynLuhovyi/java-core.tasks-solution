package com.lugowoy.tasks.calculationOfIdealWeightForGrowth;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class CalculatorIdealWeight {

    private static final BigDecimal COEFFICIENT_FOR_IDEAL_WEIGHT = new BigDecimal(110.0);

    public static void calculate(BigDecimal weight, BigDecimal growth) {
        if (growth.subtract(COEFFICIENT_FOR_IDEAL_WEIGHT).doubleValue() == weight.doubleValue()) {
            System.out.println("Your weight is perfect.");
        } else {
            if (growth.subtract(COEFFICIENT_FOR_IDEAL_WEIGHT).doubleValue() > weight.doubleValue()) {
                System.out.println("You need to get better by " + growth.subtract(COEFFICIENT_FOR_IDEAL_WEIGHT).subtract(weight) + " kg.");
            } else if (growth.subtract(COEFFICIENT_FOR_IDEAL_WEIGHT).doubleValue() < weight.doubleValue()) {
                System.out.println("You need to lose weight on " + weight.subtract(growth.subtract(COEFFICIENT_FOR_IDEAL_WEIGHT)) + " kg.");
            }
        }
    }


}
