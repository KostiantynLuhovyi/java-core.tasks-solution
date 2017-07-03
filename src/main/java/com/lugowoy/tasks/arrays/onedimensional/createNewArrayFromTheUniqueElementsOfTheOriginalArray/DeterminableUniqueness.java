package com.lugowoy.tasks.arrays.onedimensional.createNewArrayFromTheUniqueElementsOfTheOriginalArray;

/** Created by Konstantin Lugowoy on 29.05.2017. */

@FunctionalInterface
public interface DeterminableUniqueness<V, T extends Number> {

    boolean determineUniqueness(V v, T t);

    static boolean determineTheUniqueElementsOfTheOriginalArray(Array<Integer> array, Integer number) {
        boolean isUniqueElement = false;
        int count = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] == number) {
                count++;
            }
        }

        if (!(count > 1)) {
            isUniqueElement = true;
        }

        return isUniqueElement;
    }

}
