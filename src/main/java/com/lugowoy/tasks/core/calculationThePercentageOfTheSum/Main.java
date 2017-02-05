package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import com.lugowoy.util.calculable.CalculableOnTheObject;
import com.lugowoy.util.reading.*;

import java.math.BigDecimal;

/**
 * Created by Konstantin Lugowoy on 04-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 04.01.17
 * <p>
 * This class is required for startup.
 */
public class Main {
    /*
    * Instantiation class "ReadingData" an object that provides a function to read user input.
    * */
    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) throws StoppingEnterValueException {

        System.out.println("Enter sum : ");
        /*
        * Read and assigned value of the sum.
        * */
        BigDecimal sum = new BigDecimal(READING_DATA.read());

        System.out.println("Enter part of the sum : ");
        /*
        * Read and assigned value of the part of the sum.
        * */
        BigDecimal partOfTheSum = new BigDecimal(READING_DATA.read());

        /*
        * Instantiation object class "Variable". The constructor takes the value of the sum and part of the sum
        * */
        Variable variable = new Variable(sum, partOfTheSum);

        /*
        * It shall be checked that the value of the sum is larger than part of the sum.
        * */
        Comparable<Variable> variableComparable = variableToCompare -> {
            int result = 0;
            if (variableToCompare.getSum().doubleValue() > variableToCompare.getPartOfSum().doubleValue()) {
                result = 1;
            } else {
                result = 0;
            }
            return result;
        };

        /*
        * The value returned by checking the comparison value is correct, the percentage is calculated and displays the result.
        * */
        if (variableComparable.compareTo(variable) == 1) {
            CalculableOnTheObject<Variable> variableCalculableOnTheObject = new CalculatingThePercentOfSum()::calculateThePercentageOfTheSum;
            variableCalculableOnTheObject.calculate(variable);

            System.out.printf("Result calculation the percent of the sum of equal : %s", variable.getPercent().setScale(2, BigDecimal.ROUND_HALF_DOWN).stripTrailingZeros().toPlainString());
        } else {
            System.out.println("It is impossible to calculateTheAreaOfTheCircle the percentage of the sum.");
        }


    }
}
