package com.lugowoy.tasks.calculatingFibonacciNumbers;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class CalculatorRecursiveFibonacciNumbers extends CalculatorFibonacciNumbers {

    @Override
    public int calculatingOfPositiveFibonacciNumbers(int number) {
        int result = 0;
        try {
            if (number >= 0) {
                if (number == 0) {
                    result = 0;
                } else if (number == 1) {
                    result = 1;
                } else {
                    result = calculatingOfPositiveFibonacciNumbers(number - 1)
                                                                    + calculatingOfPositiveFibonacciNumbers(number - 2);
                }
            } else {
                throw new IllegalArgumentException("Incorrect value of argument. Value must be a positive number.");
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }

    @Override
    public int calculatingOfNegativeFibonacciNumbers(int number) {
        int result = 0;
        try {
            if (number <= 0) {
                if (number == 0) {
                    result = 0;
                } else if (number == -1) {
                    result = 1;
                } else {
                    result = calculatingOfNegativeFibonacciNumbers(number + 2)
                                                                    - calculatingOfNegativeFibonacciNumbers(number + 1);
                }
            } else {
                throw new IllegalArgumentException("Incorrect value of argument. Value must be a negative number.");
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return result;
    }

}
