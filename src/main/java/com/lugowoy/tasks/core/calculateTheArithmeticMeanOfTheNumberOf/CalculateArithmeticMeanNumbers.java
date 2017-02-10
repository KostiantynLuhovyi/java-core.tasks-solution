package com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin Lugowoy on 03-Dec-16.
 *
 * @author Konstantin Lugowoy.
 * @version 1.0
 * @see com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf.CalculableArithmeticMeanNumber
 * <p>
 * The class implements the execution calculation of the arithmetic mean.
 * @since 03.12.2016
 */
public class CalculateArithmeticMeanNumbers implements CalculableArithmeticMeanNumber {

    /**
    * The overridden method implements the performing calculation of the arithmetic mean value of the array of real numbers.
    * */
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
