package com.lugowoy.tasks.core.convertTheTimeInSecondsToTheCorrespondingTimeOfTheStandardView;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.converting.Converting;
import com.lugowoy.util.converting.ConvertingData;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Scanner;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final Scanner READING = new Scanner(System.in);

    public static void main(String[] args) {

        long enteredTimeInTheSecond;
        System.out.println("Enter the time in seconds : ");
        while (true) {
            if (READING.hasNextLong()) {
                enteredTimeInTheSecond = READING.nextLong();
                if (enteredTimeInTheSecond > 0) {
                    break;
                } else {
                    System.out.println("Incorrect input. Re-enter : ");
                }
            } else {
                System.out.println("Incorrect input.");
                System.exit(1);
            }
        }

        long hour = enteredTimeInTheSecond  / 3600;
        long minutes = (enteredTimeInTheSecond % 3600) / 60;
        long seconds = enteredTimeInTheSecond % 60;

        System.out.printf("Hours %d, minutes %d, seconds %d .", hour, minutes, seconds);

    }

}
