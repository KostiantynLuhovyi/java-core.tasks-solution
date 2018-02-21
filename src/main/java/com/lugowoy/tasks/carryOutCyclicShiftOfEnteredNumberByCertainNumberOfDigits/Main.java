package com.lugowoy.tasks.carryOutCyclicShiftOfEnteredNumberByCertainNumberOfDigits;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 31.10.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter a number for a circular shift : ");
        int number = READER.readInt();

        System.out.println("Enter the number of digits to shift : ");
        int numberOfDigitToShift = READER.readInt();

        StringBuilder reverseDigit = new StringBuilder();
        for (int i = 0; i < numberOfDigitToShift; i++) {
            int tmpNumber = number % 10;
            reverseDigit.insert(0, tmpNumber);
            number /= 10;
        }

        int result = Integer.parseInt(reverseDigit.toString() + number);

        System.out.println("Result : " + result);


    }

}
