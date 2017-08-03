package com.lugowoy.tasks.core.calculateHowManyHoursLeftForTheUserToBeAtWork;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final int WORKING_HOURS = 28800;

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the elapsed time from the beginning of the workday in seconds : ");
        long timeElapsedFromTheBeginningOfTeWorkdayInSeconds;
        while (true) {
                timeElapsedFromTheBeginningOfTeWorkdayInSeconds = reader.readLong();
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
