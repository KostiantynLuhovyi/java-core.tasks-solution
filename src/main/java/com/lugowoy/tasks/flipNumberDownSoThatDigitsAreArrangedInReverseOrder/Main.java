package com.lugowoy.tasks.flipNumberDownSoThatDigitsAreArrangedInReverseOrder;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        Flipper flipper = Flipper::flipNumber;
        System.out.println("Result reverse number : " + flipper.flip(number));

    }


}
