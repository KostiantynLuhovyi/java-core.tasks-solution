package com.lugowoy.tasks.calculatingFibonacciNumbers;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class CalculatorCyclicalFibonacciNumbers extends CalculatorFibonacciNumbers {

    @Override
    public int calculatingOfPositiveFibonacciNumbers(int number) {
        int a = 1, b = 1, result = 0;
        if (number >= 0) {
            System.out.println(0);
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i < number; i++) {
                result = a + b;
                a = b;
                b = result;
                System.out.println(result);
            }
        } else {
            throw new RuntimeException("Incorrect value of argument. Value must be a positive number.");
        }
        return result;
    }

    @Override
    public int calculatingOfNegativeFibonacciNumbers(int number) {
        int a = 0, b = 1, result = 0;
        if (number <= 0) {
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i > number; i--) {
                result = a - b;
                a = b;
                b = result;
                System.out.println(result);
            }
        } else {
            throw new RuntimeException("Incorrect value of argument. Value must be a negative number.");
        }
        return result;
    }

}
