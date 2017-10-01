package com.lugowoy.tasks.core.printDayOfWeekAccordingToNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 01.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the day of the week number : ");
        int numberDay;
        while (true) {
            numberDay = READER.readInt();
            if ((numberDay >= 1) && (numberDay <= 7)) {
                PrinterDayOfWeek printer = PrinterDayOfWeek::printDayOfWeekAccordingToNumberToUseSwitchInstruction;
                System.out.println("The entered value corresponds to the day of the week : " + printer.print(numberDay));
            } else {
                System.out.println("Invalid value day of the week number.");
                break;
            }
        }

    }

}
