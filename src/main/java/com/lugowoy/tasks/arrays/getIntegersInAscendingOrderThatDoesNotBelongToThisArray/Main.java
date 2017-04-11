package com.lugowoy.tasks.arrays.getIntegersInAscendingOrderThatDoesNotBelongToThisArray;

import com.lugowoy.util.fillable.Fillable;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.04.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Array<Integer> array = new Array<>(FILLABLE.fillArray(new Integer[20]));

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Findable<Integer, Array> findable = Findable::findMaxNumber;
        int maxNumberInTheArray = findable.find(array);
        System.out.println("Max number in the array : " + maxNumberInTheArray);

        findable = Findable::findMinNumber;
        int minNumberInTheArray = findable.find(array);
        System.out.println("Min number in the array : " + minNumberInTheArray);

        Array<Integer> arraySorted = new Array<>(array.getArray());
        Arrays.sort(arraySorted.getArray());

        for (int j = minNumberInTheArray + 1; j < maxNumberInTheArray; j++) {
            if (!(Arrays.binarySearch(array.getArray(), j) > 0)) {
                System.out.print(j + " ");
            }
        }

    }
}
