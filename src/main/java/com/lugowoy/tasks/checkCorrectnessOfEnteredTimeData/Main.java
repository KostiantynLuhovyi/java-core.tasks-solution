package com.lugowoy.tasks.checkCorrectnessOfEnteredTimeData;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 01.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter hours : ");
        int hours = READER.readInt();
        System.out.println("Enter minutes : ");
        int minutes = READER.readInt();
        System.out.println("Enter seconds : ");
        int seconds = READER.readInt();

        Checker checker = CheckerHours::checkCorrectHours;
        if (checker.check(hours)) {
            checker = CheckerMinutes::checkCorrectMinutes;
            if (checker.check(minutes)) {
                checker = CheckerSeconds::checkCorrectSeconds;
                if (checker.check(seconds)) {
                    System.out.printf("Time : %d hours, %d minutes, %d seconds .", hours, minutes, seconds);
                } else {
                    System.out.println("The value of seconds is invalid.");
                }
            } else {
                System.out.println("The value of minutes is invalid.");
            }
        } else {
            System.out.println("The value of hours is invalid.");
        }

    }

}
