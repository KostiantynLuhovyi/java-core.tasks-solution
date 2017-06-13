package com.lugowoy.tasks.arrays.calculateTheSumOfTheMaxAndMinElementOfThisParticularSequence;

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

/** Created by Konstantin Lugowoy on 01.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enterUserValueForSizeOfTheArray
            = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enterUserValueForSizeOfTheArray.enter(readingData);

        Array<Integer> array = creator.create(fillArray.fillArray(new Integer[sizeArray]));

        System.out.println("Original : " + array);
        System.out.println();

        Findable<Integer> findable = Main::findMax;
        int maxElement = findable.find(array.getArray());
        System.out.println(maxElement);

        findable = Main::findMin;
        int minElement = findable.find(array.getArray());
        System.out.println(minElement);

        System.out.println("Result summation : " + (maxElement + minElement));
    }

    private static int findMax(Integer[] array) {
        int result = 0;
        if ((Objects.nonNull(array)) && (array.length > 0)) {
            for (Integer integer : array) {
                if (integer > result) {
                    result = integer;
                }
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        return result;
    }

    private static int findMin(Integer[] array) {
        int result = 200;
        if ((Objects.nonNull(array)) && (array.length > 0)) {
            for (Integer integer : array) {
                if (integer < result) {
                    result = integer;
                }
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        return result;
    }

}
