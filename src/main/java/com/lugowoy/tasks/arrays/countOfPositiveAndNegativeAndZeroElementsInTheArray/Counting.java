package com.lugowoy.tasks.arrays.countOfPositiveAndNegativeAndZeroElementsInTheArray;

import java.util.Arrays;

/**
 * Created by Konstantin Lugowoy on 13-Feb-17.
 */

@FunctionalInterface
public interface Counting {

    int count(Numbers numbers);

    static int countNegativeNumber(Numbers numbers) {
        return (int) Arrays.stream(numbers.getNumbers()).filter(value -> value < 0).count();
    }

    static int countPositiveNumber(Numbers numbers) {
        return (int) Arrays.stream(numbers.getNumbers()).filter(value -> value > 0).count();
    }

    static int countZero(Numbers numbers) {
        return (int) Arrays.stream(numbers.getNumbers()).filter(value -> value == 0).count();
    }
}
