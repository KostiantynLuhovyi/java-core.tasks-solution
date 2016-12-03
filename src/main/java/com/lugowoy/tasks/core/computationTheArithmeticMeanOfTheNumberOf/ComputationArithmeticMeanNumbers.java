package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class ComputationArithmeticMeanNumbers implements ComputableArithmeticMeanNumber {

    @Override
    public double computationArithmeticMeanNumber(int [] intsNumbers) {
        double resultArithmeticMeanNumber = 0;

        for (int number : intsNumbers) {
            resultArithmeticMeanNumber += number;
        }

        resultArithmeticMeanNumber /= (intsNumbers.length-1);

        return resultArithmeticMeanNumber;
    }

}
