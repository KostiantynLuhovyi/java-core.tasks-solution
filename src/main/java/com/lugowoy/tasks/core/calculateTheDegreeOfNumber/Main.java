package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

import com.lugowoy.util.reading.ReadableUserInputData;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class Main {

    private static final CalculableTheDegreeOfNumber CALCULABLE_THE_DEGREE_OF_NUMBER = Math::pow;

    public static void main(String[] args) throws StoppingEnterValueException {

        Number number = new Number();

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter number : ");
        number.setNumber(readingData.read());

        System.out.println("Enter degree : ");
        number.setDegree(readingData.read());

        number.setResultNumber(CALCULABLE_THE_DEGREE_OF_NUMBER.getResultToCalculateTheDegreeOfNumber(number.getNumber(), number.getDegree()));

        System.out.format("Result calculate the degree of the number equal %f", number.getResultNumber());

    }
}
