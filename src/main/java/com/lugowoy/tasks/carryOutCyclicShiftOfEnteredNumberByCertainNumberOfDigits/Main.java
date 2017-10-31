package com.lugowoy.tasks.carryOutCyclicShiftOfEnteredNumberByCertainNumberOfDigits;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 31.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter a number for a circular shift : ");
        int number = READER.readInt();

        System.out.println("Enter the number of digits to shift : ");
        int numberOfDigitToShift = READER.readInt();

        String reverseDigit = "";
        for (int i = 0; i < numberOfDigitToShift; i++) {
            int tmpNumber = number % 10;
            reverseDigit = tmpNumber + reverseDigit;
            number /= 10;
        }

        int result = Integer.parseInt(reverseDigit + number);

        System.out.println("Result : " + result);


    }

}
