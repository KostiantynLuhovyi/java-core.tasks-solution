package com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public class CalculateArithmeticMeanNumbers implements CalculableArithmeticMeanNumber {

    @Override
    public double calculateArithmeticMeanNumber(Double[] doublesArray) {
        Double resultArithmeticMeanNumber = 0d;

        for (Double number : doublesArray) {
            if (number != null) {
                resultArithmeticMeanNumber += number;
            }
        }
        resultArithmeticMeanNumber /= (doublesArray.length - 1);

        return resultArithmeticMeanNumber;
    }

}
