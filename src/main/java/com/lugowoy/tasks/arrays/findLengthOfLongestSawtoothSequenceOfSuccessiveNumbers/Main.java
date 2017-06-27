package com.lugowoy.tasks.arrays.findLengthOfLongestSawtoothSequenceOfSuccessiveNumbers;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 27.06.2017. */

public class Main {

    private static FillingArray<Integer> fillingArray = new FillingArrayOfRandomNumber<>();
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creatorArray.create(fillingArray.fillArray(new int[sizeArray], 100));

        System.out.println("Original " + array);

        System.out.printf("The length of the longest sawtooth sequence is %d .", getLengthSawOfArrayElements(array));

    }

    private static int getLengthSawOfArrayElements(Array<Integer> array) {
        int lengthSaw = 0, maxLengthSaw = 0;
        boolean isPrev = false;

        for (int i = 1; i < array.getArrayOfIntegerPrimitives().length - 1; i++) {
            if ((array.getArrayOfIntegerPrimitives()[i - 1] < array.getArrayOfIntegerPrimitives()[i])
                    && (array.getArrayOfIntegerPrimitives()[i] > array.getArrayOfIntegerPrimitives()[i + 1])) {
                if (isPrev) {
                    lengthSaw += 2;
                } else {
                    lengthSaw = 3;
                    isPrev = true;
                }
                i++;
            } else {
                isPrev = false;
                maxLengthSaw = Math.max(maxLengthSaw, lengthSaw);
            }
        }
        return Math.max(maxLengthSaw, lengthSaw);

    }

}
