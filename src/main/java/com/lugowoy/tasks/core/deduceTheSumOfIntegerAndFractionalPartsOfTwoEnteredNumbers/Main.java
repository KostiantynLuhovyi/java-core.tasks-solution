package com.lugowoy.tasks.core.deduceTheSumOfIntegerAndFractionalPartsOfTwoEnteredNumbers;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter first real number : ");
        double firstRealNumber = reader.readDouble();
        System.out.println();

        System.out.println("Enter second real number : ");
        double secondRealNumber = reader.readDouble();
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
