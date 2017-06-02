package com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class MultipliablePositiveNumbers {

    public static Integer multiplication(Array<Integer> array) {
        Integer resultMultiplication = 1;
        for (Integer integer : array.getArrayOfIntegerPrimitives()) {
            if (integer > 0) {
                resultMultiplication *= integer;
            }
        }
        return resultMultiplication;
    }

}
