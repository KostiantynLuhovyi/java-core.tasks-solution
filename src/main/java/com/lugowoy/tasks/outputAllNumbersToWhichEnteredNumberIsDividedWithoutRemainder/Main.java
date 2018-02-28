package com.lugowoy.tasks.outputAllNumbersToWhichEnteredNumberIsDividedWithoutRemainder;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        System.out.println("The numbers to divide the entered number without a remainder : ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
