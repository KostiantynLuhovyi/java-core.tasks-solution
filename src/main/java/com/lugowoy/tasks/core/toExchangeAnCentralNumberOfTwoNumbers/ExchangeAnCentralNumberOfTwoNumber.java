package com.lugowoy.tasks.core.toExchangeAnCentralNumberOfTwoNumbers;

/**
 * Created by Konstantin Lugowoy on 05-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 05.02.2017
 * <p>
 * Util class encapsulates the implementation of the central exchange of numbers between two numbers.
 */
public class ExchangeAnCentralNumberOfTwoNumber {

    /*
    * A class method to perform the exchange of.
    * */
    public static void exchange(Number firstNumber, Number secondNumber) {
        int firstCenterOfNumber = getCenterOfNumber(firstNumber);
        int secondCenterOfNumber = getCenterOfNumber(secondNumber);
        parseToSetCenterNumber(firstNumber, secondCenterOfNumber);
        parseToSetCenterNumber(secondNumber, firstCenterOfNumber);
    }

    /*
    * Private class method changes the value in the number of arguments passed to the value of the argument passed.
    * */
    private static void parseToSetCenterNumber(Number number, int centerOfNumber) {
        int oneDigit, thousandthDigit;

        oneDigit = number.getNumber() % 10;

        number.setNumber(number.getNumber() / 10);

        number.setNumber(number.getNumber() / 10);

        thousandthDigit = number.getNumber();

        number.setNumber((thousandthDigit * 100) + (centerOfNumber * 10) + oneDigit);
    }

    /*
    * Private class method to find the return value of the central number from the number of arguments passed.
    * */
    private static int getCenterOfNumber(Number number) {
        int num = number.getNumber();
        int centerOfNumber;

        int oneDigit = num % 10;
        num /= 10;

        centerOfNumber = num % 10;

        return centerOfNumber;
    }
}