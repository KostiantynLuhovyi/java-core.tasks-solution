package com.lugowoy.tasks.algorithms.sorting.sortElementsInDescendingOrderOfNumberModules;

import com.lugowoy.helper.models.arrays.Array;

import static java.lang.StrictMath.abs;

/** Created by Konstantin Lugowoy on 13.07.2017. */

@FunctionalInterface
public interface Sortable<T> {

    void sort(T t);

    static void bubbleSortAscendingOfNumberModules(Array<Integer> array) {
        for (int i = array.getArray().length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (abs(array.getArray()[j]) > abs(array.getArray()[j + 1])) {
                    int tmp = array.getArray()[j];
                    array.getArray()[j] = array.getArray()[j + 1];
                    array.getArray()[j + 1] = tmp;
                }
            }
        }
    }

    static void bubbleSortDescendingOfNumberModules(Array<Integer> array) {
        for (int i = array.getArray().length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (abs(array.getArray()[j]) < abs(array.getArray()[j + 1])) {
                    int tmp = array.getArray()[j];
                    array.getArray()[j] = array.getArray()[j + 1];
                    array.getArray()[j + 1] = tmp;
                }
            }
        }
    }

}
