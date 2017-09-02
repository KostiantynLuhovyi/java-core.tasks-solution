package com.lugowoy.tasks.core.calculatingFibonacciNumbers;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        CalculatorFibonacciNumbers calculator = new CalculatorCyclicalFibonacciNumbers();

        int number = getNumberForCalculatingFibonacciNumbers();

        System.out.println("Result : ");
        if (number > 0) {
            calculator.calculatingOfPositiveFibonacciNumbers(number);
        } else if (number < 0) {
            calculator.calculatingOfNegativeFibonacciNumbers(number);
        }

    }

    private static int getNumberForCalculatingFibonacciNumbers() {
        int inputNumber;
        System.out.println("Enter number for calculating Fibonacci numbers : ");
        while (true) {
            inputNumber = reader.readInt();
            if ((inputNumber > Integer.MIN_VALUE) && (inputNumber < Integer.MAX_VALUE)) {
                break;
            } else {
                System.out.println("Incorrect input number value. Re-enter : ");
            }
        }
        return inputNumber;
    }

}
