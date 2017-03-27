package com.lugowoy.tasks.arrays.calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;

/** Created by Konstantin Lugowoy on 27.03.2017. */

@FunctionalInterface
public interface Determinable {

    int determine(Array array);

    static int determineMinElementIndex(Array array) {
        int indexMinElement = 0, valueForDetermineMinElementIndex = Integer.MAX_VALUE;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] < valueForDetermineMinElementIndex) {
                valueForDetermineMinElementIndex = array.getArray()[i];
                indexMinElement = i;
            }
        }

        return indexMinElement;
    }

    static int determineMaxElementIndex(Array array) {
        int indexMaxElement = 0, valueForDetermineMaxElementIndex = Integer.MIN_VALUE;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] > valueForDetermineMaxElementIndex) {
                valueForDetermineMaxElementIndex = array.getArray()[i];
                indexMaxElement = i;
            }
        }

        return indexMaxElement;
    }
}
