package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**
 * Created by Konstantin on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 14.12.2016
 * <p>
 * This class is required for startup.
 */
public class Main {

    /*
    * Instantiation of a functional interface to perform of a number raised to a degree.
    * The variable is initialized with a reference to a static method pow() of the class Math.
    * */
    private static final CalculateTheDegreeOfNumber CALCULATE_THE_DEGREE_OF_NUMBER = Math::pow;

    public static void main(String[] args) {
        /*
        * Class Number object instantiation,
        * that encapsulates the data to perform and assigning the result of a number raised to a degree.
        * */
        Number number = new Number();

        /*
        * Object instantiation functional interface "ReadingData" reads the user input user input from the console.
        * */
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        /*
        * Reading the value of the number and
        * the assignment of a value object encapsulates the data for a number raised to a degree.
        * */
        System.out.println("Enter number : ");
        number.setNumber(readingData.read());

        /*
        * Reading the value of the degree and
        * the assignment of a value object encapsulates the data for a number raised to a degree.
        * */
        System.out.println("Enter degree : ");
        number.setDegree(readingData.read());

        /*
        * Assigning the result of calculating the degree of the field object encapsulates the data for this operation.
        * */
        number.setResultNumber(CALCULATE_THE_DEGREE_OF_NUMBER.calculateDegreeOfNumber(number.getNumber(), number.getDegree()));

        /*
        * Output result.
        * */
        System.out.format("Result calculateTheAreaOfTheCircle the degree of the number equal %f", number.getResultNumber());

    }
}
