package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public interface Findable<T> {

    T find(Array<T> sequence);

    static Integer findMinNumber(Array<Integer> array) {
        int valueForDetermineMinNumber = Integer.MAX_VALUE;
        int indexMinNumber = 0, resultFindMinNumber;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] <= valueForDetermineMinNumber) {
                valueForDetermineMinNumber = array.getArray()[i];
                indexMinNumber = i;
            }
        }
        resultFindMinNumber = array.getArray()[indexMinNumber];

        return resultFindMinNumber;
    }

    static Integer findMaxNumber(Array<Integer> array) {
        int valueForDetermineMaxNumber = Integer.MIN_VALUE;
        int indexMaxNumber = 0, resultFindMaxNumber;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] >= valueForDetermineMaxNumber) {
                valueForDetermineMaxNumber = array.getArray()[i];
                indexMaxNumber = i;
            }
        }
        resultFindMaxNumber = array.getArray()[indexMaxNumber];

        return resultFindMaxNumber;
    }
}
