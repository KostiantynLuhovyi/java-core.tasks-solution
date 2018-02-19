package com.lugowoy.tasks.calculatingFibonacciNumbers;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 02.09.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        CalculatorFibonacciNumbers calculator = new CalculatorCyclicalFibonacciNumbers();

        int number = enterNumberForCalculatingFibonacciNumbers();

        System.out.println("Result : ");
        if (number > 0) {
            calculator.calculatingOfPositiveFibonacciNumbers(number);
        } else if (number < 0) {
            calculator.calculatingOfNegativeFibonacciNumbers(number);
        }

    }

    private static int enterNumberForCalculatingFibonacciNumbers() {
        int inputNumber;
        System.out.println("Enter number for calculating Fibonacci numbers : ");
        while (true) {
            inputNumber = READER.readInt();
            if ((inputNumber > Integer.MIN_VALUE) && (inputNumber < Integer.MAX_VALUE)) {
                break;
            } else {
                System.out.println("Incorrect input number value. Re-enter : ");
            }
        }
        return inputNumber;
    }

}
