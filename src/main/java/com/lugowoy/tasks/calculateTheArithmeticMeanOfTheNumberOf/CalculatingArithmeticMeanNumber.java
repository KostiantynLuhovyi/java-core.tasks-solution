package com.lugowoy.tasks.calculateTheArithmeticMeanOfTheNumberOf;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

@FunctionalInterface
public interface CalculatingArithmeticMeanNumber {

    double calculate(Double[] doublesArray);

    static double calculateArithmeticMeanNumber(Double[] doublesArray) {
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
