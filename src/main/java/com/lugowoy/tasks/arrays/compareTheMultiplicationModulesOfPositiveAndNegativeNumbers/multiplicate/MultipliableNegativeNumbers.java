package com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class MultipliableNegativeNumbers {

    public static Integer multiplication(Integer[] integersArray) {
        Integer resultMultiplication = 1;
        for (Integer integer : integersArray) {
            if (integer < 0) {
                resultMultiplication *= integer;
            }
        }
        return resultMultiplication;
    }

}
