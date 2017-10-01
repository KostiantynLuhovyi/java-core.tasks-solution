package com.lugowoy.tasks.core.determineWhetherIntroducedNumberHasRealPart;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 01.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter real number : ");
        double number = READER.readDouble();

        Determinator determinator = Determinator::determineWhetherIntroducedNumberHasRealPart;
        if (determinator.determine(number)) {
            System.out.printf("The entered number %.1f has a real part", number);
        } else {
            System.out.printf("The entered number %.1f does not have a real part", number);
        }

    }

}
