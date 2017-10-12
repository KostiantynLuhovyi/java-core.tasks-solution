package com.lugowoy.tasks.calculationThePercentageOfTheSum;

import com.lugowoy.helper.calculating.CalculableOnTheObject;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 04-Jan-17. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter sum : ");
        BigDecimal sum = new BigDecimal(reader.readDouble());

        System.out.println("Enter part of the sum : ");
        BigDecimal partOfTheSum = new BigDecimal(reader.readDouble());

        Variable variable = new Variable(sum, partOfTheSum);

        Comparable<Variable> variableComparable = variableToCompare -> {
            int result;
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
