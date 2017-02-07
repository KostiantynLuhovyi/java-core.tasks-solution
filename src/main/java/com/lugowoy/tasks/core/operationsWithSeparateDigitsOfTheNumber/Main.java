package com.lugowoy.tasks.core.operationsWithSeparateDigitsOfTheNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 05-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Main {

    private static final ReadingData<Integer> INTEGER_READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) throws StoppingEnterValueException {

        Number number;

        System.out.println("Enter the four-digit number : ");
        int enteredNumber;
        do {
            enteredNumber = INTEGER_READING_DATA.read();
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
