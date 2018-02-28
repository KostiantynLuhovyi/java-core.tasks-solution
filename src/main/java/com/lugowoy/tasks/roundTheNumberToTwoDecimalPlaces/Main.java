package com.lugowoy.tasks.roundTheNumberToTwoDecimalPlaces;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Main {

    public static void main(String[] args) {

        double number = enterNumber();

        double resultNumber = (int)(number * 100 + 0.5) / 100.0;

        System.out.println(resultNumber);

    }

    private static double enterNumber() {
        double number;
        Reader reader = Reader.getReader(new ReadingConsole());
        System.out.println("Enter real number : ");
        while (true) {
            number = reader.readDouble();
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
