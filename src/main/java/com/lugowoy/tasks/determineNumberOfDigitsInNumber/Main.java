package com.lugowoy.tasks.determineNumberOfDigitsInNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 13.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        int countDigitOfNumber = 0;

        System.out.printf("Enter a number from 0 to 9999 : ");
        while (true) {
            int number = READER.readInt();
            if ((number >= 0) && (number <= 9999)) {
                while (number > 0) {
                    number /= 10;
                    countDigitOfNumber++;
                }
                System.out.printf("The number of digits in the number is : %d", countDigitOfNumber);
                break;
            } else {
                System.out.println("Incorrect number value. Re-enter : ");
            }
        }


    }

}
