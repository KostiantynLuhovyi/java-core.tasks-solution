package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.calculating.CalculatingData;
import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        LinearEquation equation = new LinearEquation();

        CalculatingData<LinearEquation> linearEquationCalculatingData = new CalculatingData<>(new CalculateLinearEquation()::calculate);

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter value \"a\" : ");
        equation.setA(readingData.read());

        System.out.println("Enter value \"b\"");
        equation.setB(readingData.read());

        linearEquationCalculatingData.calculate(equation);

        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }
}
