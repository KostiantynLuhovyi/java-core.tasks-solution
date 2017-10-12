package com.lugowoy.tasks.calculatingFibonacciNumbers;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class CalculatorRecursiveFibonacciNumbers extends CalculatorFibonacciNumbers {

    @Override
    public int calculatingOfPositiveFibonacciNumbers(int number) {
        if (number >= 0) {
             if (number == 0) {
                 return 0;
             } else if (number == 1) {
                 return 1;
             } else {
                 return calculatingOfPositiveFibonacciNumbers(number - 1) + calculatingOfPositiveFibonacciNumbers(number - 2);
             }
        } else {
            throw new IllegalArgumentException("Incorrect value of argument. Value must be a positive number.");
        }
    }

    @Override
    public int calculatingOfNegativeFibonacciNumbers(int number) {
        if (number <= 0) {
            if (number == 0) {
                return 0;
            } else if (number == -1) {
                return 1;
            } else {
                return calculatingOfNegativeFibonacciNumbers(number + 2) - calculatingOfNegativeFibonacciNumbers(number + 1);
            }
        } else {
            throw new RuntimeException("Incorrect value of argument. Value must be a negative number.");
        }
    }

}
