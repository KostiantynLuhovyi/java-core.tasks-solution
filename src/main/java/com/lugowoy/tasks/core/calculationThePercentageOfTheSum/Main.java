package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import com.lugowoy.util.calculable.CalculableOnTheObject;
import com.lugowoy.util.reading.*;

import java.math.BigDecimal;


/**
 * Created by Konstantin on 04-Jan-17.
 */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) throws StoppingEnterValueException {

        System.out.println("Enter sum : ");
        BigDecimal sum = new BigDecimal(READING_DATA.read());

        System.out.println("Enter part of the sum : ");
        BigDecimal partOfTheSum = new BigDecimal(READING_DATA.read());

        Variable variable = new Variable(sum, partOfTheSum);

        Comparable<Variable> variableComparable = variableToCompare -> {
            int result = 0;
            if (variableToCompare.getSum().doubleValue() > variableToCompare.getPartOfSum().doubleValue()) {
                result = 1;
            } else {
                result = 0;
            }
            return result;
        };

        if (variableComparable.compareTo(variable) == 1) {
            CalculableOnTheObject<Variable> variableCalculableOnTheObject = new CalculatingThePercentOfSum()::calculateThePercentageOfTheSum;
            variableCalculableOnTheObject.calculate(variable);

            System.out.printf("Result calculation the percent of the sum of equal : %s", variable.getPercent().setScale(2, BigDecimal.ROUND_HALF_DOWN).stripTrailingZeros().toPlainString());
        } else {
            System.out.println("It is impossible to calculateTheAreaOfTheCircle the percentage of the sum.");
        }



    }
}
