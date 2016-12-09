package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.util.fillable.FillingArray;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class Main {

    public static void main(String[] args) {

        double [] doubleNumbers = new double[2];

        Numbers numbers = new Numbers();

        FillingArray<Numbers> fillingArray = new FillingArray<>();

        numbers.setNumbers(fillingArray.fillArrayDoubleNumbers(doubleNumbers));

        ComputationArithmeticMeanNumbers arithmeticMeanNumbers = new ComputationArithmeticMeanNumbers();

        numbers.setResultArithmeticMeanNumbers(arithmeticMeanNumbers.computationArithmeticMeanNumber(numbers.getNumbers()));

        System.out.printf("The arithmetic mean of the entered real numbers equals %f",numbers.getResultArithmeticMeanNumbers());

    }

}
