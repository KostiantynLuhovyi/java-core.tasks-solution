package com.lugowoy.tasks.calculateCostOfCallWithPerSecondBilling;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final int COST_OF_THE_MINUTES = 15;

    public static void main(String[] args) {

        long timeOfStartCallInTheSeconds, timeOfFinishCallInTheSeconds;

        timeOfStartCallInTheSeconds = enterTimeOfStartCallInTheSeconds("Enter the start time of the call.");

        timeOfFinishCallInTheSeconds = enterTimeOfStartCallInTheSeconds("Enter the finish time of the call.");

        BigDecimal costOfTheCall = new BigDecimal((double) (timeOfFinishCallInTheSeconds - timeOfStartCallInTheSeconds) * COST_OF_THE_MINUTES / 60);

        System.out.println("The cost of the call is : " + costOfTheCall);

    }

    private static long enterTimeOfStartCallInTheSeconds(String msg) {
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
