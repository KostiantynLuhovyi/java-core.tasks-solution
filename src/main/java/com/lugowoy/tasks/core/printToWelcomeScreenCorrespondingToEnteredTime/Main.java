package com.lugowoy.tasks.core.printToWelcomeScreenCorrespondingToEnteredTime;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.tasks.core.checkCorrectnessOfEnteredTimeData.Checker;
import com.lugowoy.tasks.core.checkCorrectnessOfEnteredTimeData.CheckerHours;
import com.lugowoy.tasks.core.checkCorrectnessOfEnteredTimeData.CheckerMinutes;
import com.lugowoy.tasks.core.checkCorrectnessOfEnteredTimeData.CheckerSeconds;

/** Created by Konstantin Lugowoy on 04.10.2017. */

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
                    Printer printer = new PrinterWelcomeCorrespondingToEnteredTime(hours);
                    printer.print();
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
