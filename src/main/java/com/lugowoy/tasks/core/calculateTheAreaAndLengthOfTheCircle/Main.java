package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.reading.ReadableUserInputData;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public class Main {

    private static final CalculableTheAreaAndLengthOfTheCircle CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE =
            new CalculateTheAreaAndLehgthOfTheCircle();

    public static void main(String[] args) throws StoppingEnterValueException {

        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        circle.setRadius(readingData.read());

        circle.setArea(CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE.calculateTheAreaOfTheCircle(circle.getRadius()));
        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        circle.setLength(CALCULABLE_THE_AREA_AND_LENGTH_OF_THE_CIRCLE.calculateTheLengthOfThtCircle(circle.getRadius()));
        System.out.format("The lehgth of the circle is equal to %.3f", circle.getLength());


    }
}
