package com.lugowoy.tasks.core.calculateTheCostOfCallWithPerSecondBilling;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final int COST_OF_THE_MINUTES = 15;

    private static final ReadingData<Integer> READING = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        long timeOfStartCallInTheSeconds, timeOfFinishCallInTheSeconds;

        timeOfStartCallInTheSeconds = getTimeOfStartCallInTheSeconds("Enter the start time of the call.");

        timeOfFinishCallInTheSeconds = getTimeOfStartCallInTheSeconds("Enter the finish time of the call.");

        BigDecimal costOfTheCall = new BigDecimal((double) (timeOfFinishCallInTheSeconds - timeOfStartCallInTheSeconds) * 15 / 60);

        System.out.println("The cost of the call is : " + costOfTheCall);

    }

    private static long getTimeOfStartCallInTheSeconds(String msg) {
        System.out.println(msg);
        int hours, minutes, seconds;
        while (true) {
            System.out.println("Hours : ");
            hours = READING.read();
            System.out.println("Minutes : ");
            minutes = READING.read();
            System.out.println("Seconds : ");
            seconds = READING.read();

            if ((minutes > 60) && (seconds > 60)) {
                System.out.println("Incorrect input.");
            } else {
                break;
            }
        }
        return (long) (hours * 3600 + minutes * 60 + seconds);
    }

}
