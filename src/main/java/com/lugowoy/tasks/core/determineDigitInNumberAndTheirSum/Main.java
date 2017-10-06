package com.lugowoy.tasks.core.determineDigitInNumberAndTheirSum;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = getEnteredNumber();

        Determinator<Integer> determinator = DeterminatorDigitInNumber::determineDigitInNumber;
        determinator.determine(number);

    }

    private static int getEnteredNumber() {
        int number;
        while (true) {
            number = READER.readInt();
            if ((number >= (Integer.MIN_VALUE + 1)) && (number <= (Integer.MAX_VALUE - 1))) {
                break;
            } else {
                System.out.println("Incorrect value. Re-enter : ");
            }
        }
        return number;
    }

}
