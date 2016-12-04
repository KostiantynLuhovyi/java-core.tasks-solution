package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class ComputationArithmeticMeanNumbers implements ComputableArithmeticMeanNumber {

    @Override
    public double computationArithmeticMeanNumber(double[] doublesArray) {
        double resultArithmeticMeanNumber = 0;

        for (double number : doublesArray) {
            resultArithmeticMeanNumber += number;
        }

        resultArithmeticMeanNumber /= (doublesArray.length-1);

        return resultArithmeticMeanNumber;
    }

}
