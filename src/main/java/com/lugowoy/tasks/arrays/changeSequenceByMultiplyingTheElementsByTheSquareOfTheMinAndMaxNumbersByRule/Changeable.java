package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Changeable<T, V> {

    void change(T t, V firstArg, V secondArg);

    static void changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumberByRule(Array<Integer> array, Integer squareMinNumber, Integer squareMaxNumber) {
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] >= 0) {
                array.getArray()[i] *= squareMinNumber;
            } else if (array.getArray()[i] <= 0) {
                array.getArray()[i] *= squareMaxNumber;
            }
        }
    }
}
