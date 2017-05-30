package com.lugowoy.tasks.arrays.createAnOrderedArrayFromTheElementsOfTwoOtherOrderedArrays;

/** Created by Konstantin Lugowoy on 30.05.2017. */

@FunctionalInterface
public interface Mergeable<T> {

    T merge(T firstT, T secondT);

    static Array mergeArrays(Array firstArray, Array secondArray) {
        Array resultArray = new Array(new Integer[firstArray.getArray().length + secondArray.getArray().length]);

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;

        for (int i = 0; i < resultArray.getArray().length; i++) {
            resultArray.getArray()[i] = firstArray.getArray()[firstArrayIndex] < secondArray.getArray()[secondArrayIndex]
                                        ? firstArray.getArray()[firstArrayIndex++] : secondArray.getArray()[secondArrayIndex++];

            if (firstArrayIndex == firstArray.getArray().length) {
                System.arraycopy(secondArray.getArray(), secondArrayIndex, resultArray.getArray(), ++i, secondArray.getArray().length - secondArrayIndex);
                break;
            }
            if (secondArrayIndex == secondArray.getArray().length) {
                System.arraycopy(firstArray.getArray(), firstArrayIndex, resultArray.getArray(), ++i, firstArray.getArray().length - firstArrayIndex);
                break;
            }
        }

        return resultArray;
    }

}
