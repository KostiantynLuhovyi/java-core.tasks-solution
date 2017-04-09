package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

import com.lugowoy.util.calculable.CalculableOnTheObject;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

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

    public static void main(String[] args) {
        /*
        * Instantiation class "LinearEquation" the reference variable "equation" to calculate the value of the root of a linear equation.
        */
        LinearEquation equation = new LinearEquation();

        /*
        * Instantiation of a functional interface "CalculableOnTheObject" the reference variable "linearEquationCalculableOnTheObject".
        * Initialized reference to the method of "getRootOfTheLinearEquation()" object of class "CalculateLinearEquation",
        * to calculate the value of the root of a linear equation.
        * */
        CalculableOnTheObject<LinearEquation> linearEquationCalculableOnTheObject = new CalculateLinearEquation()::getRootOfTheLinearEquation;

        System.out.println("Calculate root in the linear equation : ax + b = 0");

        /*
        * instantiated object of a class "ReadingData".
        * The argument to the constructor is passed a reference to the method of the object that implements the reading of user input.
        * */
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter value \"a\" : ");
        /*
        * Reads and set to the first variable linear equation.
        * */
        equation.setA(readingData.read());

        System.out.println("Enter value \"b\"");
        /*
        * Reads and set to the second variable linear equation.
        * */
        equation.setB(readingData.read());

        /*
        * Calculating the value of the root of a linear equation.
        * */
        linearEquationCalculableOnTheObject.calculate(equation);

        /*
        * Output result.
        * */
        System.out.format("Root (x) in the linear equation equal : %f", equation.getXRootLinearEquation());

    }
}
