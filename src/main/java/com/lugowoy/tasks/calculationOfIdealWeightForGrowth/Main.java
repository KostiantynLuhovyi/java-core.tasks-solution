package com.lugowoy.tasks.calculationOfIdealWeightForGrowth;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter growth : ");
        BigDecimal growth = new BigDecimal(READER.readDouble());
        System.out.println("Enter weight : ");
        BigDecimal weight = new BigDecimal(READER.readDouble());

        CalculatorIdealWeight.calculate(weight, growth);


    }

}
