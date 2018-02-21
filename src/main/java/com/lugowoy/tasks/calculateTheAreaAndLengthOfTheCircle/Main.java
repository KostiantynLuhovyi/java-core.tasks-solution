package com.lugowoy.tasks.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.helper.calculating.CalculationUsingOneParameter;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        try {

            System.out.println("Enter the radius of the circle : ");
            circle.setRadius(Reader.getReader(new ReadingConsole()).readDouble());

            CalculationUsingOneParameter<Circle, Circle> calculator = CalculatingTheAreaOfTheCircle::calculateTheAreaOfTheCircle;
            calculator.calculate(circle);

            System.out.format("The area of the circle is equal to %f", circle.getArea());

            System.out.println();

            calculator = CalculatingTheLengthOfTheCircle::calculateTheLengthOfTheCircle;
            calculator.calculate(circle);

        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.format("The length of the circle is equal to %.3f", circle.getLength());

    }

}
