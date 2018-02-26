package com.lugowoy.tasks.calculateHowManyHoursLeftForUserToBeAtWork;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    private static final int WORKING_HOURS = 28800;

    public static void main(String[] args) {

        System.out.println("Enter the elapsed time from the beginning of the workday in seconds : ");
        long timeElapsedFromTheBeginningOfTeWorkdayInSeconds;
        while (true) {
                timeElapsedFromTheBeginningOfTeWorkdayInSeconds = READER.readLong();
                if (timeElapsedFromTheBeginningOfTeWorkdayInSeconds > 0) {
                    break;
                } else {
                    System.out.println("Incorrect input. Re-enter : ");
                }
        }

        int resultHowManyHoursLeftAtWork = (int) ((WORKING_HOURS - timeElapsedFromTheBeginningOfTeWorkdayInSeconds) / 3600);

        if (resultHowManyHoursLeftAtWork <= 0) {
            System.out.println("The working day is over.");
        } else {
            System.out.println(resultHowManyHoursLeftAtWork + " hours left to work.");
        }

    }

}
