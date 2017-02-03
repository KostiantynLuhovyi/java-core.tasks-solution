package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.calculable.CalculableOnTheObject;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 14.12.2016
 * <p>
 * This class is required for startup.
 */
public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        LinearEquation equation = new LinearEquation();

        CalculableOnTheObject<LinearEquation> linearEquationCalculableOnTheObject = new CalculateLinearEquation()::getRootOfTheLinearEquation;

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter value \"a\" : ");
        equation.setA(readingData.read());

        System.out.println("Enter value \"b\"");
        equation.setB(readingData.read());

        linearEquationCalculableOnTheObject.calculate(equation);

        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }
}
