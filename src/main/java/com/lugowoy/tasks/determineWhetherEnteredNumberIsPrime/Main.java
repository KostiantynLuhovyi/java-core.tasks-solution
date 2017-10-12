package com.lugowoy.tasks.determineWhetherEnteredNumberIsPrime;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.printf("Number %d is prime.", number);
        } else {
            System.out.printf("Number %d is not prime.", number);
        }

    }

}
