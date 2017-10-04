package com.lugowoy.tasks.core.calculationOfIdealWeightForGrowth;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter growth : ");
        BigDecimal growth = new BigDecimal(READER.readDouble());
        System.out.println("Enter weight : ");
        BigDecimal weight = new BigDecimal(READER.readDouble());

        CalculatorIdealWeigth.calculate(weight, growth);


    }

}
