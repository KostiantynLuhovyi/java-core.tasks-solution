package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillerArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating.CalculatingPercentage;
import com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating.Calculator;
import com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating.CalculatorPercentage;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 23.10.2017. */

public class Main {

    private static final int LENGTH_ARRAY = 100;
    private static final int MIN_BOUND = -100;
    private static final int MAX_BOUND = 100;

    private static final CalculatingPercentage<Integer> CALCULATING_PERCENTAGE = new CalculatorPercentage<>();

    public static void main(String[] args) {

        Array<Integer> array = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(LENGTH_ARRAY);

        FillerArrayNumbers.getFillerArrayNumbers(new FillingArrayRandomIntegerNumbers()).fill(array, MIN_BOUND,
                                                                                                     MAX_BOUND);

        System.out.println("Numbers : ");
        System.out.println(Arrays.toString(array.getArray()));

        System.out.println("The numbers contains.");
        Calculator<Integer> calculator = new Calculator<>();

        calculator.setCalculating(CALCULATING_PERCENTAGE::calculatePercentageOfPositiveNumbers);
        System.out.println("Percentage positive numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(CALCULATING_PERCENTAGE::calculatePercentageOfNegativeNumbers);
        System.out.println("Percentage negative numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(CALCULATING_PERCENTAGE::calculatePercentageOfZeroNumbers);
        System.out.println("Percentage zero number : " + calculator.calculate(array) + " %");

        calculator.setCalculating(CALCULATING_PERCENTAGE::calculatePercentageOfEvenNumbers);
        System.out.println("Percentage even numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(CALCULATING_PERCENTAGE::calculatePercentageOfOddNumbers);
        System.out.println("Percentage odd numbers : " + calculator.calculate(array) + " %");

    }

}
