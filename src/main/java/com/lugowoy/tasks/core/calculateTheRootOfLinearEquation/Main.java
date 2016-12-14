package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.reading.ForStopingEnterValueException;
import com.lugowoy.util.reading.Reading;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class Main {

    private static final Reading READING = new Reading();

    public static void main(String[] args) throws ForStopingEnterValueException {

        LinearEquation equation = new LinearEquation();

        CalculableLinearEquation calculableLinearEquation = new CalculateLinearEquation();

            System.out.println("Calculate root in the linear equation : ax + b = 0");

            System.out.println("Enter value \"a\" : ");
            equation.setA(READING.readDouble());

            System.out.println("Enter value \"b\"");
            equation.setB(READING.readDouble());

            calculableLinearEquation.getCalculateXRootLinearEquation(equation);

            System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }
}
