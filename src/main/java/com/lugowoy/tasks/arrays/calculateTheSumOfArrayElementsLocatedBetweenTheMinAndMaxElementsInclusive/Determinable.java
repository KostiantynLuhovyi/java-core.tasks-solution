package com.lugowoy.tasks.arrays.calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 27.03.2017. */

@FunctionalInterface
public interface Determinable {

    int determine(Array<Integer> array);

    static int determineMinElementIndex(Array<Integer> array) {
        int indexMinElement = 0, valueForDetermineMinElementIndex = Integer.MAX_VALUE;
            if (array != null) {
                if ((array.getArrayOfIntegerPrimitives() != null) && (array.getArrayOfIntegerPrimitives().length > 0)) {
                    for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
                        if (array.getArrayOfIntegerPrimitives()[i] < valueForDetermineMinElementIndex) {
                        valueForDetermineMinElementIndex = array.getArrayOfIntegerPrimitives()[i];
                        indexMinElement = i;
                        }
                    }
                } else {
                    System.out.println("The array is not valid for any operations or calculations.");
                }
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }

        return indexMinElement;
    }

    static int determineMaxElementIndex(Array<Integer> array) {
        int indexMaxElement = 0, valueForDetermineMaxElementIndex = Integer.MIN_VALUE;
        if (array != null) {
            if ((array.getArrayOfIntegerPrimitives() != null) && (array.getArrayOfIntegerPrimitives().length > 0)) {
                for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
                    if (array.getArrayOfIntegerPrimitives()[i] > valueForDetermineMaxElementIndex) {
                        valueForDetermineMaxElementIndex = array.getArrayOfIntegerPrimitives()[i];
                        indexMaxElement = i;
                    }
                }
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        return indexMaxElement;
    }

}
