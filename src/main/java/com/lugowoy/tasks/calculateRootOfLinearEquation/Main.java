package com.lugowoy.tasks.calculateRootOfLinearEquation;

import com.lugowoy.helper.calculating.CalculationUsingOneParameter;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        LinearEquation equation = new LinearEquation();

        CalculationUsingOneParameter<LinearEquation, LinearEquation> linearEquationCalculableOnTheObject =
                                                                                new CalculatingLinearEquation()::calculateRootOfTheLinearEquation;

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        System.out.println("Enter value \"a\" : ");
        equation.setA(READER.readDouble());

        System.out.println("Enter value \"b\" : ");
        equation.setB(READER.readDouble());

        linearEquationCalculableOnTheObject.calculate(equation);

        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }

}
