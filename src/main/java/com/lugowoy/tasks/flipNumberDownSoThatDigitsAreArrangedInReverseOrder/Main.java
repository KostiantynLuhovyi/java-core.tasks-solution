package com.lugowoy.tasks.flipNumberDownSoThatDigitsAreArrangedInReverseOrder;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 06.10.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        Flipper flipper = Flipper::flipNumber;
        System.out.println("Result reverse number : " + flipper.flip(number));

    }


}
