package com.lugowoy.tasks.core.displayModuleEnteredNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 12.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter number : ");
        int number = READER.readInt();

        System.out.println("Module number : " + displayModule(number));

    }

    private static int displayModule(int number) {
        return (number < 0) ? -number : number;
    }

}
