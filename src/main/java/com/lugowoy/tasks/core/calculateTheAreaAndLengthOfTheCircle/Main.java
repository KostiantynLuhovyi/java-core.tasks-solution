package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.util.calculating.CalculatingData;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 15-Dec-16.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 15.12.2016
 *
 * This class is required for startup.
 */

public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");

        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        circle.setRadius(readingData.read());

        CalculatingData<Double> calculatingData;

        calculatingData = new CalculatingData<>(new CalculateTheAreaOfTheCircle()::calculate);
        circle.setArea(calculatingData.calculate(circle.getRadius()));
        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        calculatingData = new CalculatingData<>(new CalculateTheLengthOfTheCircle()::calculate);
        circle.setLength(calculatingData.calculate(circle.getRadius()));
        System.out.format("The lehgth of the circle is equal to %.3f", circle.getLength());


    }
}
