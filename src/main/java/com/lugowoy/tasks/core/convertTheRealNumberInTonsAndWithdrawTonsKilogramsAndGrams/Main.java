package com.lugowoy.tasks.core.convertTheRealNumberInTonsAndWithdrawTonsKilogramsAndGrams;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 26.03.2017. */

public class Main {

    private static final ReadingData<Double> READING = new ReadingData<>(new ReadingUserInputData()::readDouble);

    private static final Convertable CONVERTABLE = Convertable::convertRealNumberInTonsAndWithdrawTonsKilogramsAndGrams;

    public static void main(String[] args) {

        System.out.println("Enter the real number of the number of tons : ");
        double enterNumberOfTons = READING.read();

        CONVERTABLE.convert(enterNumberOfTons);

    }

}
