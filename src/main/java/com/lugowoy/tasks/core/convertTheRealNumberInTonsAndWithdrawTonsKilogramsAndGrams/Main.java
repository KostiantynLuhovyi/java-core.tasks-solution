package com.lugowoy.tasks.core.convertTheRealNumberInTonsAndWithdrawTonsKilogramsAndGrams;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 26.03.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    private static final Convertable CONVERTABLE = Convertable::convertRealNumberInTonsAndWithdrawTonsKilogramsAndGrams;

    public static void main(String[] args) {

        System.out.println("Enter the real number of the number of tons : ");
        double enterNumberOfTons = reader.readDouble();

        CONVERTABLE.convert(enterNumberOfTons);

    }

}
