package com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers;

import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.Multipliable;
import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.MultipliableNegativeNumbers;
import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.MultipliablePositiveNumbers;
import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enteringTheSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enteringTheSizeOfTheArray.enter(readingData);

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original array : " + array);
        System.out.println();

        Multipliable<Integer, Array<Integer>> multipliable = MultipliableNegativeNumbers::multiplication;
        Integer resultModuleOfNegativeNumbers = Math.abs(multipliable.multiplication(array));

        multipliable = MultipliablePositiveNumbers::multiplication;
        Integer resultModuleOfPositiveNumbers = Math.abs(multipliable.multiplication(array));

        if (resultModuleOfNegativeNumbers > resultModuleOfPositiveNumbers) {
            System.out.println("Multiplication negative numbers on the module larger positive numbers.");
        } else if (resultModuleOfPositiveNumbers > resultModuleOfNegativeNumbers) {
            System.out.println("Multiplication positive numbers on the module larger negative numbers.");
        }

    }

}
