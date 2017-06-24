package com.lugowoy.tasks.arrays.findNumbersInSequenceThatAreTheSquareOfNumber;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 12.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray], 50));

        System.out.println("Original sequence : " + array);
        System.out.println();

        System.out.println("Enter a number to compare : ");
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        int compareNumber = reading.read();

        System.out.println("Result : ");
        int quantityResult = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            int number = array.getArray()[i];
            int squareRootNumber = (int)Math.pow(number, 2);
            if (compareNumber == squareRootNumber) {
                System.out.printf("Sequence index : %d, element : %d", i,number);
                quantityResult++;
            }
        }

        if (quantityResult == 0) {
            System.out.println("There are no numbers in the sequence satisfying condition.");
        }
    }

}
