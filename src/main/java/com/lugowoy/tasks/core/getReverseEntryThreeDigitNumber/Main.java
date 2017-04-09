package com.lugowoy.tasks.core.getReverseEntryThreeDigitNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**Created by Konstantin Lugowoy on 03-Feb-17.*/

public class Main {

    private static final ReadingData<Integer> INTEGER_READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        int number;

        System.out.println("Enter the three-digit number : ");
        number = INTEGER_READING_DATA.read();

        while (true) {
            if (number > 999 || number < 102) {
                System.out.println("Not correct the three-digit number.");
                System.out.println("Re-enter : ");
                number = INTEGER_READING_DATA.read();
            } else {
                Reversible reversible = new ReverseService();
                System.out.printf("Result : %d", reversible.reverse(number));
                break;
            }
        }

    }
}
