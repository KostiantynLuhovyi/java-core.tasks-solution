package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

import com.lugowoy.helper.filling.array.numbers.FillerArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayReadDoubleNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public class Main {

    private static final int LENGTH_ARRAY = 3;

    public static void main(String[] args) {

        System.out.println("Enter numbers to calculate arithmetic mean number : ");
        Numbers numbers = new Numbers(Arrays.stream(FillerArrayNumbers.getFillerArrayNumbers(new FillingArrayReadDoubleNumbers(
                                                                                                    new ReadingConsole())).fill(LENGTH_ARRAY))
                                            .mapToDouble(Double::doubleValue)
                                            .toArray());

        System.out.println();
        System.out.println("You entered the numbers : " + numbers);

        System.out.println();

        CalculatingArithmeticMeanNumber calculating = CalculatingArithmeticMeanNumber::calculateArithmeticMeanNumber;

        double resultArithmeticMeanNumbers = calculating.calculate(numbers);

        System.out.printf("The arithmetic mean of the entered real numbers equals %f", resultArithmeticMeanNumbers);

    }

}
