package com.lugowoy.tasks.arrays.determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence;

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
import java.util.Random;

/** Created by Konstantin Lugowoy on 12.04.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enterUserValueForSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArrays = enterUserValueForSizeOfTheArray.enter(readingData);

        Array<Integer> firstArray = creator.create(fillArray.fillArray(new int[sizeArrays], 50));
        Array<Integer> secondArray = creator.create(fillArray.fillArray(new int[sizeArrays], 50));

        System.out.println("First array : " + firstArray);
        System.out.println();

        System.out.println("Second array : " + secondArray);
        System.out.println();

        Determinable<Array<Integer>> determinable = Determinable::determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence;
        boolean resultDetermine = determinable.determine(firstArray, secondArray);

        if (resultDetermine) {
            System.out.println("Elements of the second sequence are included in the first sequence.");
        } else {
            System.out.println("Elements of the second sequence are not included in the first sequence.");
        }

    }

}
