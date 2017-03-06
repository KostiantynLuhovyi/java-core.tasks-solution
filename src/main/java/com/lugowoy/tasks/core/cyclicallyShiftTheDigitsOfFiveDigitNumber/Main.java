package com.lugowoy.tasks.core.cyclicallyShiftTheDigitsOfFiveDigitNumber;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 06.03.2017. */

public class Main {

    private static final Shiftable<Number> NUMBER_SHIFTABLE = number -> {
        int tmpNumber = number.getNumber() % 10;
        number.setNumber(number.getNumber() / 10);
        number.setNumber(10000 * tmpNumber + number.getNumber());
    };

    private static final Reading<Integer> READING = new ReadingUserInputData()::readInt;

    private static final int NUMBER_OF_DIGITS_FOR_SHIFT = 2;

    public static void main(String[] args) {

        Number number = new Number();
        System.out.println("Enter five-digit number : ");
        do {
            number.setNumber(READING.reading());
        } while (number.getNumber() == -1);

        System.out.println("");


        for (int i = 0; i < NUMBER_OF_DIGITS_FOR_SHIFT; i++) {
            NUMBER_SHIFTABLE.shift(number);
        }

        System.out.println("Result : " + number.getNumber());
    }
}
