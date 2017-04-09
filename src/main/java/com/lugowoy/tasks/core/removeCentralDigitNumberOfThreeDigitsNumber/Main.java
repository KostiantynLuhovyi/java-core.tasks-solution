package com.lugowoy.tasks.core.removeCentralDigitNumberOfThreeDigitsNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**Created by Konstantin Lugowoy on 07-Feb-17.*/

public class Main {

    private static final ReadingData<Integer> INTEGER_READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter the three-digit number : ");
        int enteredNumber = INTEGER_READING_DATA.read();
        Number number = new Number(enteredNumber);

        ParserToRemove remove = new ParserToRemove();

        remove.removeCentralDigitOfTheNumber(number);

        System.out.println(number.getNumber());

    }
}
