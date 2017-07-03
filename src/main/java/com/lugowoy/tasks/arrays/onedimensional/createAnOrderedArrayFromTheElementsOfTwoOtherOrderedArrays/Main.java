package com.lugowoy.tasks.arrays.onedimensional.createAnOrderedArrayFromTheElementsOfTwoOtherOrderedArrays;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 30.05.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArrays = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> firstArray = creator.create(fillArray.fillArray(new int[sizeArrays]));

        Arrays.sort(firstArray.getArrayOfIntegerPrimitives());

        Array<Integer> secondArray = creator.create(fillArray.fillArray(new int[sizeArrays]));

        Arrays.sort(secondArray.getArrayOfIntegerPrimitives());

        System.out.println("Original first array : " + firstArray);
        System.out.println();

        System.out.println("Original second array : " + secondArray);
        System.out.println();

        Mergeable<Array> mergeable = Mergeable::mergeArrays;
        Array resultArray = mergeable.merge(firstArray, secondArray);

        System.out.println("Result array : " + resultArray);
        System.out.println();

    }

}
