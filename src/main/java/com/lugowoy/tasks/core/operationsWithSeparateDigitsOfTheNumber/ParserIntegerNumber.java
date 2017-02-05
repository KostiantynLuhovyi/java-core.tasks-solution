package com.lugowoy.tasks.core.operationsWithSeparateDigitsOfTheNumber;

/**
 * Created by Konstantin on 05-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class ParserIntegerNumber {

    public static int getSingleDigitOfTheNumber(int number, int posDigit) {
        String digitNumber = Integer.toString(number);
        int resultSingleDigitNumber = 0;
        for (int i = 0; i < digitNumber.length(); i++) {
            if (i == posDigit) {
                resultSingleDigitNumber = digitNumber.charAt(i);
            }
        }
        return resultSingleDigitNumber;
    }
}