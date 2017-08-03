package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class Main {

    private static final CalculateTheDegreeOfNumber CALCULATE_THE_DEGREE_OF_NUMBER = Math::pow;

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Number number = new Number();

        System.out.println("Enter number : ");
        number.setNumber(reader.readDouble());

        System.out.println("Enter degree : ");
        number.setDegree(reader.readDouble());

        number.setResultNumber(CALCULATE_THE_DEGREE_OF_NUMBER.calculateDegreeOfNumber(number.getNumber(), number.getDegree()));

        System.out.format("Result calculateTheAreaOfTheCircle the degree of the number equal %f", number.getResultNumber());

    }

}
