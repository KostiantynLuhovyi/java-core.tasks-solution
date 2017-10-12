package com.lugowoy.tasks.exchangeAnCentralNumberOfTwoNumbers;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 05-Feb-17. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Number firstNumber = getInputNumber();
        Number secondNumber = getInputNumber();

        System.out.printf("The following values have been entered : \n" +
                "first number = %d;\nsecond number = %d.\n", firstNumber.getNumber(), secondNumber.getNumber());

        ExchangeAnCentralNumberOfTwoNumber.exchange(firstNumber, secondNumber);

        System.out.printf("The result to exchange central number of  the two numbers : \n" +
                "first number = %d;\nsecond number = %d.\n", firstNumber.getNumber(), secondNumber.getNumber());

    }

    private static Number getInputNumber() {
        Number number;
        int value;
        do {
            System.out.println("Enter value : ");
            value = reader.readInt();
            if ((value > 102) && (value < 999)) {
                number = new Number(value);
                break;
            } else {
                System.out.println("Not correct input value.");
            }
        } while (true);

        return number;
    }

}
