package com.lugowoy.tasks.core.printAllThreeDigitNumbersThatDoNotHaveSameDigits;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = new CreatorArrayOfIntegerPrimitives().create(new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt).fillArray(new int[sizeArray], 101, 999));

        System.out.println("Numbers : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Result numbers : ");
        printAllThreeDigitNumbersThatDoNotHaveSameDigits(array);

    }

    private static void printAllThreeDigitNumbersThatDoNotHaveSameDigits(Array<Integer> array) {
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> {
            String stringOfValue = Integer.toString(value);
            if (stringOfValue.length() == 3) {
                int tmpValue = value;
                int firstDigit = tmpValue % 10;
                tmpValue /= 10;
                int secondDigit = tmpValue % 10;
                int thirdDigit = tmpValue / 10;

                if ( ! ((firstDigit == secondDigit) || (secondDigit == thirdDigit) || (thirdDigit == firstDigit))) {
                    System.out.print(value + " ");
                }
            }
        });

    }


}
