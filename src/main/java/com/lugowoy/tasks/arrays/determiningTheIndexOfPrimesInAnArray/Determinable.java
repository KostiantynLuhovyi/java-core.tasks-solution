package com.lugowoy.tasks.arrays.determiningTheIndexOfPrimesInAnArray;

/** Created by Konstantin Lugowoy on 22.05.2017. */

@FunctionalInterface
public interface Determinable<T extends Number> {

    boolean determine(T number);

    static boolean determineTheIndexOfPrimesInAnArray(Integer number) {
        boolean isPrimeNumber = true;
        if (number == 1) {
            isPrimeNumber = false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }

        return isPrimeNumber;
    }

}
