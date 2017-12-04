package com.lugowoy.tasks.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.helper.calculating.CalculationUsingOneParameter;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");
        circle.setRadius(new Reader(new ReadingDataUserInputInConsole()).readDouble());

        CalculationUsingOneParameter<Circle, Circle> calculator = CalculatingTheAreaOfTheCircle::calculateTheAreaOfTheCircle;
        calculator.calculate(circle);

        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        calculator = CalculatingTheLengthOfTheCircle::calculateTheLengthOfTheCircle;
        calculator.calculate(circle);

        System.out.format("The length of the circle is equal to %.3f", circle.getLength());

    }

}
