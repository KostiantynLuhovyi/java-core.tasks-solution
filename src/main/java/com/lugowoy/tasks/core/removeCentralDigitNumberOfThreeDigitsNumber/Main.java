package com.lugowoy.tasks.core.removeCentralDigitNumberOfThreeDigitsNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 07-Feb-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the three-digit number : ");
        int enteredNumber = reader.readInt();
        Number number = new Number(enteredNumber);

        ParserToRemove remove = new ParserToRemove();

        remove.removeCentralDigitOfTheNumber(number);

        System.out.println(number.getNumber());

    }

}
