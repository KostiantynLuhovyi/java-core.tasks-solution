package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        LinearEquation equation = new LinearEquation();

        CalculableLinearEquation calculableLinearEquation = new CalculateLinearEquation();

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter value \"a\" : ");
        equation.setA(readingData.read());

        System.out.println("Enter value \"b\"");
        equation.setB(readingData.read());

        calculableLinearEquation.getCalculateXRootLinearEquation(equation);

        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }
}
