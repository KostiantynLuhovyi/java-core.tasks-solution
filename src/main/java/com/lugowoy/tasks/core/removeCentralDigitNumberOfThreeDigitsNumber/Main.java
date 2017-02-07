package com.lugowoy.tasks.core.removeCentralDigitNumberOfThreeDigitsNumber;

import com.lugowoy.tasks.core.operationsWithSeparateDigitsOfTheNumber.*;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 07-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Main {

    private static final ReadingData<Integer> INTEGER_READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) throws StoppingEnterValueException {



        System.out.println("Enter the three-digit number : ");
        int enteredNumber = INTEGER_READING_DATA.read();
        Number number = new Number(enteredNumber);

        ParserToRemove remove = new ParserToRemove();

        remove.removeCentralDigitOfTheNumber(number);

        System.out.println(number.getNumber());



    }
}
