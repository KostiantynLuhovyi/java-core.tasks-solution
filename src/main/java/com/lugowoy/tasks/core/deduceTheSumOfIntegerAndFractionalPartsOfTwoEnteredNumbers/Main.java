package com.lugowoy.tasks.core.deduceTheSumOfIntegerAndFractionalPartsOfTwoEnteredNumbers;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static final ReadingData<Double> READING = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) {

        System.out.println("Enter first real number : ");
        double firstRealNumber = READING.read();
        System.out.println();

        System.out.println("Enter second real number : ");
        double secondRealNumber = READING.read();
        System.out.println();

        Summable<Double> summable = Summable::summarizeIntegerPartOfTwoNumbers;
        double resultSumOfIntegerPartsOfTwoNumbers = summable.summarize(firstRealNumber, secondRealNumber);

        summable = Summable::summarizeFractionalPartOfTwoNumbers;
        double resultSumOfFractionalPartsOfTwoNumbers = summable.summarize(firstRealNumber, secondRealNumber);

        System.out.printf("The sum of the integer and fractional parts of the entered numbers %f and %f is : \n" +
                "sum of the integer parts : %f ;\n" +
                "sum of the fractional parts : %f .", firstRealNumber, secondRealNumber, resultSumOfIntegerPartsOfTwoNumbers, resultSumOfFractionalPartsOfTwoNumbers);
    }

}
