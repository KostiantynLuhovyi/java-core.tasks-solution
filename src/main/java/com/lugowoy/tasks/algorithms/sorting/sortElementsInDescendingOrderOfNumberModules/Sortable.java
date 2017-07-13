package com.lugowoy.tasks.algorithms.sorting.sortElementsInDescendingOrderOfNumberModules;

import com.lugowoy.util.models.arrays.Array;

import static java.lang.Math.*;

/** Created by Konstantin Lugowoy on 13.07.2017. */

@FunctionalInterface
public interface Sortable<T> {

    void sort(T t);

    static void bubbleSortAscendingOfNumberModules(Array<Integer> array) {
        for (int i = array.getArrayOfIntegerPrimitives().length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (abs(array.getArrayOfIntegerPrimitives()[j]) > abs(array.getArrayOfIntegerPrimitives()[j + 1])) {
                    int tmp = array.getArrayOfIntegerPrimitives()[j];
                    array.getArrayOfIntegerPrimitives()[j] = array.getArrayOfIntegerPrimitives()[j + 1];
                    array.getArrayOfIntegerPrimitives()[j + 1] = tmp;
                }
            }
        }

    }

    static void bubbleSortDescendingOfNumberModules(Array<Integer> array) {
        for (int i = array.getArrayOfIntegerPrimitives().length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (abs(array.getArrayOfIntegerPrimitives()[j]) < abs(array.getArrayOfIntegerPrimitives()[j + 1])) {
                    int tmp = array.getArrayOfIntegerPrimitives()[j];
                    array.getArrayOfIntegerPrimitives()[j] = array.getArrayOfIntegerPrimitives()[j + 1];
                    array.getArrayOfIntegerPrimitives()[j + 1] = tmp;
                }
            }
        }

    }

}
