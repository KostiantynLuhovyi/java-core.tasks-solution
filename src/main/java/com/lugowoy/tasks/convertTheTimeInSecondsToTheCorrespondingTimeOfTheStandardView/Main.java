package com.lugowoy.tasks.convertTheTimeInSecondsToTheCorrespondingTimeOfTheStandardView;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        long enteredTimeInTheSecond;
        System.out.println("Enter the time in seconds : ");
        while (true) {
            enteredTimeInTheSecond = reader.readLong();
            if (enteredTimeInTheSecond > 0) {
                break;
            } else {
                    System.out.println("Incorrect input. Re-enter : ");
            }
        }

        long hour = enteredTimeInTheSecond  / 3600;
        long minutes = (enteredTimeInTheSecond % 3600) / 60;
        long seconds = enteredTimeInTheSecond % 60;

        System.out.printf("Hours %d, minutes %d, seconds %d .", hour, minutes, seconds);

    }

}
