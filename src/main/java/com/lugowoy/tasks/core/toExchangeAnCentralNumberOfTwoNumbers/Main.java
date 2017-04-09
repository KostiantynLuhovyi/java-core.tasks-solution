package com.lugowoy.tasks.core.toExchangeAnCentralNumberOfTwoNumbers;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin Lugowoy on 05-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 05.02.2017
 * <p>
 * This class is required for startup.
 */
public class Main {
    /*
    * Instantiate an object of class "ReadingData". The object encapsulates the function for user entered data reading.
    * */
    private static final ReadingData<Integer> INTEGER_READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {
        /*
        * Instantiating an object of class "Number". The object encapsulates a variable whose value will be used for the exchange.
        * */
        Number firstNumber = getInputNumber();
        /*
        * Instantiating an object of class "Number". The object encapsulates a variable whose value will be used for the exchange.
        * */
        Number secondNumber = getInputNumber();

        /*
        * Output the original values.
        * */
        System.out.printf("The following values have been entered : \n" +
                "first number = %d;\nsecond number = %d.\n", firstNumber.getNumber(), secondNumber.getNumber());

        /*
        * Calling a static method of exchanging the central numbers between two numbers.
        * */
        ExchangeAnCentralNumberOfTwoNumber.exchange(firstNumber, secondNumber);

        /*
        * Output result.
        * */
        System.out.printf("The result to exchange central number of  the two numbers : \n" +
                "first number = %d;\nsecond number = %d.\n", firstNumber.getNumber(), secondNumber.getNumber());


    }

    /*
    * Static method of validating user input. If the value is correct, then return the object containing the value.
    * */
    private static Number getInputNumber() {
        Number number = null;
        int value = 0;
        do {
            System.out.println("Enter value : ");
            value = INTEGER_READING_DATA.read();
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
