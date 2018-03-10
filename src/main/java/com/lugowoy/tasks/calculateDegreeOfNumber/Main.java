package com.lugowoy.tasks.calculateDegreeOfNumber;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    private static final CalculatingDegreeOfNumber CALCULATE_THE_DEGREE_OF_NUMBER = Math::pow;

    public static void main(String[] args) {

        Number number = new Number();

        System.out.println("Enter number : ");
        number.setNumber(READER.readDouble());

        System.out.println("Enter degree : ");
        number.setDegreeOfNumber(READER.readDouble());

        number.setNumberReducedToDegree(CALCULATE_THE_DEGREE_OF_NUMBER.calculateDegreeOfNumber(number.getNumber(),
                                                                                               number.getDegreeOfNumber()));

        System.out.format("Result calculateTheAreaOfTheCircle the degree of the number equal %f",
                                                                                     number.getNumberReducedToDegree());

    }

}
