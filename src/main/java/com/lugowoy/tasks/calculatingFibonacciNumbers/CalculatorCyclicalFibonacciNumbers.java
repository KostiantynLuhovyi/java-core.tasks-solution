package com.lugowoy.tasks.calculatingFibonacciNumbers;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class CalculatorCyclicalFibonacciNumbers extends CalculatorFibonacciNumbers {

    @Override
    public int calculatingOfPositiveFibonacciNumbers(int number) {
        int result = 0;
        try {
            int a = 1, b = 1;
            if (number >= 0) {
                /*System.out.println(0);*/
                System.out.println(a);
                System.out.println(b);
                for (int i = 0; i < number; i++) {
                    result = a + b;
                    a = b;
                    b = result;
                    System.out.println(result);
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
            int a = 0, b = 1;
            if (number <= 0) {
                /*System.out.println(a);*/
                System.out.println(b);
                for (int i = 0; i > number; i--) {
                    result = a - b;
                    a = b;
                    b = result;
                    System.out.println(result);
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
