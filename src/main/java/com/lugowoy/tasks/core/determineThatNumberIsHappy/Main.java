package com.lugowoy.tasks.core.determineThatNumberIsHappy;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 17.08.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the number of verification it is \"happy\" : ");
        int number = reader.readInt();

        DeterminableThatNumberIsHappy determinator = new DeterminatorThatNumberIsHappy();

        if (determinator.determineThatNumberIsHappy(number)) {
            System.out.printf("The entered number %d is \"happy\" .", number);
        } else {
            System.out.printf("The entered number %d is not \"happy\" .", number);
        }

    }

}
