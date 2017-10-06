package com.lugowoy.tasks.core.checkThatAllDigitsOfNumberAreArrangedInAscendingOrder;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        boolean resultCheck = false;
        while (number != 0) {
            int tmpFirst = number % 10;
            int tmpSecond = number % 100 / 10;
            if (tmpFirst >= tmpSecond) {
                number /= 10;
                resultCheck = true;
            } else {
                resultCheck = false;
                break;
            }
        }

        if (resultCheck) {
            System.out.println("The digits in the number go in ascending order.");
        } else {
            System.out.println("The digits in the number do not go in ascending order.");
        }

    }


}
