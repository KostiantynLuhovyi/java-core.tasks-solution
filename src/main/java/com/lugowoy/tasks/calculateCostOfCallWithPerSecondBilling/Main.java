package com.lugowoy.tasks.calculateCostOfCallWithPerSecondBilling;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final int COST_OF_THE_MINUTES = 15;

    private static final int MINUTES_OF_HOUR = 60;

    public static void main(String[] args) {

        long timeOfStartCallInSeconds = enterCallTimeInSeconds("Enter the start time of the call.");
        long timeOfFinishCallInSeconds = enterCallTimeInSeconds("Enter the finish time of the call.");

        BigDecimal costOfTheCall = new BigDecimal(calculateCostOfCall(timeOfStartCallInSeconds, timeOfFinishCallInSeconds));

        System.out.println("The cost of the call is : " + costOfTheCall);

    }

    private static double calculateCostOfCall(long timeOfStartCallInSeconds, long timeOfFinishCallInSeconds) {
        return (double) (timeOfFinishCallInSeconds - timeOfStartCallInSeconds) * COST_OF_THE_MINUTES / MINUTES_OF_HOUR;
    }

    private static long enterCallTimeInSeconds(String msg) {
        Reader reader = Reader.getReader(new ReadingConsole());

        System.out.println(msg);
        int hours, minutes, seconds;
        while (true) {
            System.out.println("Hours : ");
            hours = reader.readInt();
            System.out.println("Minutes : ");
            minutes = reader.readInt();
            System.out.println("Seconds : ");
            seconds = reader.readInt();

            if ((minutes > 60) && (seconds > 60)) {
                System.out.println("Incorrect input.");
            } else {
                break;
            }
        }
        return (long) (hours * 3600 + minutes * 60 + seconds);
    }

}
