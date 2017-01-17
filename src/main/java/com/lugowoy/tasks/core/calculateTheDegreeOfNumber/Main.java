package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

import com.lugowoy.util.reading.ForStopingEnterValueException;
import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class Main {

    public static final Reading READING = new Reading();

    private static final CalculableTheDegreeOfNumber CALCULABLE_THE_DEGREE_OF_NUMBER = Math::pow;

    public static void main(String[] args) throws ForStopingEnterValueException {

        Number number = new Number();

        System.out.println("Enter number : ");
        number.setNumber(READING.readDouble());

        System.out.println("Enter degree : ");
        number.setDegree(READING.readDouble());

        number.setResultNumber(CALCULABLE_THE_DEGREE_OF_NUMBER.getResultToCalculateTheDegreeOfNumber(number.getNumber(),number.getDegree()));

        System.out.format("Result calculate the degree of the number equal %f", number.getResultNumber());

    }
}
