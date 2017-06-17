package com.lugowoy.tasks.arrays.sortAnArrayConsistingOfZerosOnesAndTwos;

import com.lugowoy.util.models.arrays.Array;

import java.util.Objects;

/** Created by Konstantin Lugowoy on 17.06.2017. */

@FunctionalInterface
public interface Sortable<T> {

    void sort(T t);

    static void sortArray(Array<Integer> array) {
        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArrayOfIntegerPrimitives())) && (array.getArrayOfIntegerPrimitives().length > 0)) {
                int index = 0;

                for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
                    if (array.getArrayOfIntegerPrimitives()[i] == 0) {

                        swapElements(array, index, i);
                        ++index;
                    }
                }

                for (int i = index; i < array.getArrayOfIntegerPrimitives().length; i++) {
                    if (array.getArrayOfIntegerPrimitives()[i] == 1) {

                        swapElements(array, index, i);
                        ++index;
                    }
                }
            }
        }
    }

    static void swapElements(Array<Integer> array, int concreteIndex, int iteratorIndex) {
        int temp = array.getArrayOfIntegerPrimitives()[iteratorIndex];
        array.getArrayOfIntegerPrimitives()[iteratorIndex] = array.getArrayOfIntegerPrimitives()[concreteIndex];
        array.getArrayOfIntegerPrimitives()[concreteIndex] = temp;
    }

}
