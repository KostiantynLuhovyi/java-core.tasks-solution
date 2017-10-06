package com.lugowoy.tasks.core.determineDigitInNumberAndTheirSum;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class DeterminatorDigitInNumber {

    public static void determineDigitInNumber(int number) {
        int countDigit = 0;
        int sumDigit = 0;
        while (true) {
            if (number != 0) {
                int digit = number % 10;
                number /= 10;
                countDigit++;

                sumDigit = getSumDigitInNumber(digit, sumDigit);
            } else {
                break;
            }
        }
        System.out.println("Digit in number is : " + countDigit + ".");
        System.out.println("Sum of digit in number is : " + sumDigit + ".");
    }

    private static int getSumDigitInNumber(int digit, int sumDigit) {
        sumDigit += digit;
        return sumDigit;
    }

}
