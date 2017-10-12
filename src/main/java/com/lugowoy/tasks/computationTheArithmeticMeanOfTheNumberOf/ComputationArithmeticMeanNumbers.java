package com.lugowoy.tasks.computationTheArithmeticMeanOfTheNumberOf;

/**Created by Konstantin Lugowoy on 03-Dec-16.*/

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
