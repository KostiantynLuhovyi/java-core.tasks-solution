package com.lugowoy.tasks.arrays.determineTheMostRepeatedElementInAnArray;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Objects;

/** Created by Konstantin Lugowoy on 22.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enterUserValueForSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enterUserValueForSizeOfTheArray.enter(readingData);

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray], 100));

        System.out.println("Original array : " + array);
        System.out.println();

        determineTheMostRepeatedElementsInAnArray.determine(array);

    }

    private static Determinable<Integer> determineTheMostRepeatedElementsInAnArray = array -> {
        int count, countMax = 0, value = 1, num = 0;

        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArray())) && (array.getArray().length > 2)) {
                for (int i = 0; i < array.getArray().length; i++) {
                    count = 1;
                    for (int j = i + 1; j < array.getArray().length; j++) {
                        if (array.getArray()[i].equals(array.getArray()[j])) {
                            value = array.getArray()[j];
                            count++;
                        } else if (count > countMax) {
                            countMax = count;
                            if (value <= array.getArray()[i]) {
                                num = i;
                            }
                        }
                    }
                }
            }
        }
        if (countMax == 1) {
            System.out.println("No repetitive elements in the array.");
        } else {
            System.out.println("Element " + array.getArray()[num] + ", repeated " + countMax);
        }
    };
}
