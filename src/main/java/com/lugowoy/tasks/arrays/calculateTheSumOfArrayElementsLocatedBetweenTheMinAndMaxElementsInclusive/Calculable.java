package com.lugowoy.tasks.arrays.calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;

/** Created by Konstantin Lugowoy on 27.03.2017. */

@FunctionalInterface
public interface Calculable {

    int calculate(Array array, int indexMinElement, int indexMaxElement);

    static int calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive(Array array, int indexMinElement, int indexMaxElement) {
        int resultSum = 0;

        for (int i = indexMinElement; i <= indexMaxElement; i++) {
            resultSum += array.getArray()[i];
        }

        return resultSum;
    }
}
