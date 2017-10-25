package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating.*;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 23.10.2017. */

public class Main {

    private static final int LENGTH_ARRAY = 100;
    private static final int MIN_BOUND = -100;
    private static final int MAX_BOUND = 100;

    private static final CalculatingPercentage<Integer> calculatingPercentage = new CalculatorPercentage<>();

    public static void main(String[] args) {

        Array<Integer> array = new CreatorOfArrayModels<>(
                                    new FactoryOfIntegerArrayModels()).create(
                                            new FillingArrayIntegerRandomNumbers().fill(LENGTH_ARRAY, MIN_BOUND, MAX_BOUND));

        System.out.println("Numbers : ");
        System.out.println(Arrays.toString(array.getArray()));

        System.out.println("The numbers contains.");
        Calculator<Integer> calculator = new Calculator<>();

        calculator.setCalculating(calculatingPercentage::calculatePercentageOfPositiveNumbers);
        System.out.println("Percentage positive numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(calculatingPercentage::calculatePercentageOfNegativeNumbers);
        System.out.println("Percentage negative numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(calculatingPercentage::calculatePercentageOfZeroNumbers);
        System.out.println("Percentage zero number : " + calculator.calculate(array) + " %");

        calculator.setCalculating(calculatingPercentage::calculatePercentageOfEvenNumbers);
        System.out.println("Percentage even numbers : " + calculator.calculate(array) + " %");

        calculator.setCalculating(calculatingPercentage::calculatePercentageOfOddNumbers);
        System.out.println("Percentage odd numbers : " + calculator.calculate(array) + " %");

    }



}
