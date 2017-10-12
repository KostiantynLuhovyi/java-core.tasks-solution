package com.lugowoy.tasks.printAllThreeDigitNumbersThatDoNotHaveSameDigits;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.DeterminatorSizeOfArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Integer> array = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels()).create(new FillingArrayIntegerRandomNumbers().fill(sizeArray));

        System.out.println("Numbers : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Result numbers : ");
        printAllThreeDigitNumbersThatDoNotHaveSameDigits(array);

    }

    private static void printAllThreeDigitNumbersThatDoNotHaveSameDigits(Array<Integer> array) {
        Arrays.stream(array.getArray()).forEachOrdered(value -> {
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
