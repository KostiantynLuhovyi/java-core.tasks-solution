package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.reading.ForStopingEnterValueException;
import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public class Main {

    private static final Reading READING = new Reading();

    private static final CalculableTheAreaAndLengthOfTheCircle CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE =
            new CalculateTheAreaAndLehgthOfTheCircle();

    public static void main(String[] args) throws ForStopingEnterValueException {

        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");
        circle.setRadius(READING.readDouble());

        circle.setArea(CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE.calculateTheAreaOfTheCircle(circle.getRadius()));
        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        circle.setLength(CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE.calculateTheLengthOfThtCircle(circle.getRadius()));
        System.out.format("The lehgth of the circle is equal to %.3f", circle.getLength());


    }
}
