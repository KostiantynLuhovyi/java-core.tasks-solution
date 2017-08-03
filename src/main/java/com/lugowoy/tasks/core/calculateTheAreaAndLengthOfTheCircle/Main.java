package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import com.lugowoy.helper.calculating.CalculableOnTheObject;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println("Enter the radius of the circle : ");

        circle.setRadius(new Reader(new ReadingDataUserInputInConsole()).readDouble());

        CalculableOnTheObject<Circle> calculable;

        calculable = new CalculateTheAreaOfTheCircle()::calculateTheAreaOfTheCircle;
        calculable.calculate(circle);

        System.out.format("The area of the circle is equal to %f", circle.getArea());

        System.out.println();

        calculable = new CalculateTheLengthOfTheCircle()::calculateTheLengthOfTheCircle;
        calculable.calculate(circle);

        System.out.format("The length of the circle is equal to %.3f", circle.getLength());

    }

}
