package com.lugowoy.tasks.determineWhetherFiveDigitNumberIsPalindrome;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 14.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter a number consisting of five digits : ");
        int number = enterNumber();

        Determinator determinator = Determinator::determineWhetherFiveDigitNumberIsPalindrome;
        if (determinator.determine(number)) {
            System.out.printf("Number %d is a polindrome.", number);
        } else {
            System.out.printf("Number %d is a not polindrome.", number);
        }

    }

    private static int enterNumber() {
        int number;
        while (true) {
            number = READER.readInt();
            if (checkThatNumberContainsFiveDigits(number)) {
                break;
            } else {
                System.out.println("Incorrect number. Re-enter : ");
            }
        }
        return number;
    }

    private static boolean checkThatNumberContainsFiveDigits(int number) {
        boolean resultCheck = false;
        int duplicateNumber = number;
        int countDigitsOfNumber = 0;
        while (duplicateNumber > 0) {
            duplicateNumber /= 10;
            countDigitsOfNumber++;
        }
        if (countDigitsOfNumber == 5) {
            resultCheck = true;
        }
        return resultCheck;
    }


}
