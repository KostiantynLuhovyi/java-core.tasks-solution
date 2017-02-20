package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.util.fillable.Fillable;
import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfUserInput;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**Created by Konstantin Lugowoy on 03-Dec-16.*/

public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        Double[] doubleNumbers = new Double[2];

        Numbers numbers = new Numbers();

        Fillable<Double> fillable = new FillingArrayOfUserInput<>(new ReadingUserInputData()::readDouble);

        numbers.setNumbers(fillable.fillArray(doubleNumbers));

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            System.out.println(numbers.getNumbers()[i]);
        }

        ComputationArithmeticMeanNumbers arithmeticMeanNumbers = new ComputationArithmeticMeanNumbers();

        numbers.setResultArithmeticMeanNumbers(arithmeticMeanNumbers.computationArithmeticMeanNumber(numbers.getNumbers()));

        System.out.printf("The arithmetic mean of the entered real numbers equals %f",numbers.getResultArithmeticMeanNumbers());

    }

}
