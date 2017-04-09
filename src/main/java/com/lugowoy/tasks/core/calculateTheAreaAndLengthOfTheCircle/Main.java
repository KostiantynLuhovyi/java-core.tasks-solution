package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.calculable.CalculableOnTheObject;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**
 * Created by Konstantin on 15-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 15.12.2016
 * <p>
 * This class is required for startup.
 */
public class Main {

    public static void main(String[] args) {

        /*
        * Instantiation of class "Circle" object.
        * */
        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");
        /*
        * Instantiation class "ReadingData" object to read user input.
        * The constructor takes a parameter a reference to the method of implementing the reading of user input into the console.
        * */
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);
        /*
        * The read data is assigned to the variable object class "Circle".
        * */
        circle.setRadius(readingData.read());

        //Declaring reference variable functional interface "CalculableOnTheObject" to calculate on the object.
        CalculableOnTheObject<Circle> calculable;

        //Variable instantiation "calculable" reference to the method of implementing the calculation area of a circle.
        calculable = new CalculateTheAreaOfTheCircle()::calculateTheAreaOfTheCircle;
        //Calling from the functional interface of the object to calculate area of a circle.
        calculable.calculate(circle);
        //Output result.
        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        //Variable instantiation "calculable" reference to the method of implementing the calculation length of a circle.
        calculable = new CalculateTheLengthOfTheCircle()::calculateTheLengthOfTheCircle;
        //Calling from the functional interface of the object to calculate length of a circle.
        calculable.calculate(circle);
        //Output result.
        System.out.format("The length of the circle is equal to %.3f", circle.getLength());


    }
}
