package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class ComputationArithmeticMeanNumbers implements ComputableArithmeticMeanNumber {

    @Override
    public double computationArithmeticMeanNumber(Double[] doublesArray) {
        Double resultArithmeticMeanNumber = 0d;

        for (Double number : doublesArray) {
            if (number != null) {
                resultArithmeticMeanNumber += number;
            }
        }
        resultArithmeticMeanNumber /= (doublesArray.length-1);

        return resultArithmeticMeanNumber;
    }

}
