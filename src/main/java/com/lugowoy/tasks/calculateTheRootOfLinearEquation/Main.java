package com.lugowoy.tasks.calculateTheRootOfLinearEquation;

import com.lugowoy.helper.calculating.CalculableOnTheObject;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class Main {

    public static void main(String[] args) {

        LinearEquation equation = new LinearEquation();

        CalculableOnTheObject<LinearEquation> linearEquationCalculableOnTheObject = new CalculateLinearEquation()::getRootOfTheLinearEquation;

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        System.out.println("Enter value \"a\" : ");
        equation.setA(new Reader(new ReadingDataUserInputInConsole()).readDouble());

        System.out.println("Enter value \"b\"");
        equation.setB(new Reader(new ReadingDataUserInputInConsole()).readDouble());

        linearEquationCalculableOnTheObject.calculate(equation);

        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }

}
