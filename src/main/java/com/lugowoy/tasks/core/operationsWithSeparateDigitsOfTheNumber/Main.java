package com.lugowoy.tasks.core.operationsWithSeparateDigitsOfTheNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 05-Feb-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Number number;

        System.out.println("Enter the four-digit number : ");
        int enteredNumber;
        do {
            enteredNumber = reader.readInt();
            String enteredNumberForVerification = Integer.toString(enteredNumber);
            if (enteredNumberForVerification.length() == 4) {
                number = new Number(enteredNumber);
                break;
            } else {
                System.out.println("Entered incorrect number. Re-enter : ");
            }
        } while (true);

        int firstDigitOfNumber = ParserIntegerNumber.getSingleDigitOfTheNumber(number.getNumber(), 1);
        int lastDigitOfNumber = ParserIntegerNumber.getSingleDigitOfTheNumber(number.getNumber(), 4);

        System.out.printf("The sum of the first and last digit numbers contained in the entered number equal : %d", firstDigitOfNumber + lastDigitOfNumber);

        System.out.println();

        int secondDigitOfNumber = ParserIntegerNumber.getSingleDigitOfTheNumber(number.getNumber(), 2);
        int thirdDigitOfNumber = ParserIntegerNumber.getSingleDigitOfTheNumber(number.getNumber(), 3);

        System.out.printf("The difference between the second and third digit numbers contained in the entered number equal : %d", secondDigitOfNumber - thirdDigitOfNumber);

    }

}
