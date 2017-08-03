package com.lugowoy.tasks.core.getReverseEntryThreeDigitNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 03-Feb-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        int number;

        System.out.println("Enter the three-digit number : ");
        number = reader.readInt();

        while (true) {
            if (number > 999 || number < 102) {
                System.out.println("Not correct the three-digit number.");
                System.out.println("Re-enter : ");
                number = reader.readInt();
            } else {
                Reversible reversible = new ReverseService();
                System.out.printf("Result : %d", reversible.reverse(number));
                break;
            }
        }

    }

}
