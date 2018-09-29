package com.lugowoy.tasks.printToNameOfMonthCorrespondingToGivenNumber;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 29.09.2018. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter number of the month : ");
        int numberOfMonth = 0;
        while (true) {
             numberOfMonth = READER.readInt();
            if (numberOfMonth > 0 && numberOfMonth <= 12) {
                break;
            } else {
                System.out.println("Incorrect value number of the month. Re-enter : ");
            }
        }

        for (Month month : Month.values()) {
            if (month.getIndexOFMonth() == numberOfMonth) {
                System.out.println("The entered value corresponds to the " + month + " month.");
                break;
            }
        }

    }

}
