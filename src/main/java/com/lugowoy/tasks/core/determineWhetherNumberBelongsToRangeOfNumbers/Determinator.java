package com.lugowoy.tasks.core.determineWhetherNumberBelongsToRangeOfNumbers;

/** Created by Konstantin Lugowoy on 11.09.2017. */

@FunctionalInterface
public interface Determinator {

    boolean determine(int number, int minBound, int maxBound);

    static boolean detrmineWhetherNumberBelongsToRangeOfNumbers(int number, int minBound, int maxBound) {
        boolean result = false;
        if ((number >= minBound) && (number <= maxBound)) {
            result = true;
        }
        return result;
    }

}
