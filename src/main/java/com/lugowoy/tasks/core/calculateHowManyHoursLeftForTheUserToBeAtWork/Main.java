package com.lugowoy.tasks.core.calculateHowManyHoursLeftForTheUserToBeAtWork;

import java.util.Scanner;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final int WORKING_HOURS = 28800;

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the elapsed time from the beginning of the workday in seconds : ");
        long timeElapsedFromTheBeginningOfTeWorkdayInSeconds;
        while (true) {
            if (SCANNER.hasNextLong()) {
                timeElapsedFromTheBeginningOfTeWorkdayInSeconds = SCANNER.nextLong();
                if (timeElapsedFromTheBeginningOfTeWorkdayInSeconds > 0) {
                    break;
                } else {
                    System.out.println("Incorrect input. Re-enter : ");
                }
            } else {
                System.out.println("Incorrect input.");
                System.exit(1);
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
