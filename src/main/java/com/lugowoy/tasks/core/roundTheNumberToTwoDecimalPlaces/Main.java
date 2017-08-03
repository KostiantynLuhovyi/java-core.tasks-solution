package com.lugowoy.tasks.core.roundTheNumberToTwoDecimalPlaces;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Main {

    public static void main(String[] args) {

        double number = getNumber();

        double resultNumber = (int)(number * 100 + 0.5) / 100.0;

        System.out.println(resultNumber);

    }

    private static double getNumber() {
        double number;
        System.out.println("Enter real number : ");
        while (true) {
            number = new Reader(new ReadingDataUserInputInConsole()).readDouble();
            if (number > 0) {
                break;
            } else {
                System.out.println("Number must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return number;
    }

}
