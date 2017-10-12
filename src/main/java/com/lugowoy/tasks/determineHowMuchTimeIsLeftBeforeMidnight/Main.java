package com.lugowoy.tasks.determineHowMuchTimeIsLeftBeforeMidnight;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    private static final int SECONDS_IN_DAY = 86400;

    public static void main(String[] args) {

        int numberOfSecondsSinceTheBeginningOfTheDay = getNumberOfSecondsSinceTheBeginningOfTheDay("Enter number of seconds since the beginning of the day :");

        int numberOfSecondsLeftInTheDay = SECONDS_IN_DAY - numberOfSecondsSinceTheBeginningOfTheDay;

        int hoursEndToTheDay = numberOfSecondsLeftInTheDay / 3600;
        int minutesEndToTheDay = numberOfSecondsLeftInTheDay / 60 - hoursEndToTheDay * 60;
        int secondsEndToTheDay = numberOfSecondsLeftInTheDay - minutesEndToTheDay * 60 - hoursEndToTheDay * 3600;

        System.out.printf("%d hours, %d minutes, %d seconds it remains until midnight.", hoursEndToTheDay, minutesEndToTheDay, secondsEndToTheDay);

    }

    private static int getNumberOfSecondsSinceTheBeginningOfTheDay(String msg) {
        int numberOfSecondsSinceTheBeginningOfTheDay;
        System.out.println(msg);
        while (true) {
            numberOfSecondsSinceTheBeginningOfTheDay = reader.readInt();
            if ((numberOfSecondsSinceTheBeginningOfTheDay >= 0) && (numberOfSecondsSinceTheBeginningOfTheDay <= SECONDS_IN_DAY)) {
                break;
            } else {
                System.out.println("Number of seconds since the beginning of the day must be a positive number or not more 86400.");
                System.out.println("Re-enter : ");
            }
        }
        return numberOfSecondsSinceTheBeginningOfTheDay;
    }

}
