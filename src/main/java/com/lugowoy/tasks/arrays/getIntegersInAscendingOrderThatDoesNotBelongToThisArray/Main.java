package com.lugowoy.tasks.arrays.getIntegersInAscendingOrderThatDoesNotBelongToThisArray;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfPrimitives;
import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.04.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter a value for the size of the array : ");
        int sizeArray = readingData.read();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Findable<Integer, Array> findable = Findable::findMaxNumber;
        int maxNumberInTheArray = findable.find(array);
        System.out.println("Max number in the array : " + maxNumberInTheArray);

        findable = Findable::findMinNumber;
        int minNumberInTheArray = findable.find(array);
        System.out.println("Min number in the array : " + minNumberInTheArray);

        Array<Integer> arraySorted = creator.create(array.getArrayOfIntegerPrimitives());
        Arrays.sort(arraySorted.getArray());

        for (int j = minNumberInTheArray + 1; j < maxNumberInTheArray; j++) {
            if (!(Arrays.binarySearch(array.getArray(), j) > 0)) {
                System.out.print(j + " ");
            }
        }

    }
}
