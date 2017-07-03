package com.lugowoy.tasks.arrays.onedimensional.determineTheMaxRadiusOfTheCircleWithTheCenterAtTheOriginWhichContainsAllThePoints;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 14.05.2017. */

public class Main {

    private static ReadingData<Integer> readingData;

    public static void main(String[] args) {

        ArrayOfCoordinatesOfThePointsOfThePlane arrayOfCoordinates = new ArrayOfCoordinatesOfThePointsOfThePlane();

        System.out.println("Enter the number of points to define : ");
        readingData = new ReadingData<>(new ReadingUserInputData()::readInt);
        int numberOfPoints = readingData.read();

        readingData = new ReadingData<>(new ReadingRandomData()::readInt);
        arrayOfCoordinates.setCoordinatesOfPoints(Arrays.stream(new Integer[numberOfPoints * 2])
                                                        .mapToInt(value -> value = readingData.read())
                                                        .toArray());

        System.out.println("Coordinates of points : ");
        int countLn = 0;
        for (int i = 0; i < arrayOfCoordinates.getCoordinatesOfPoints().length; i++) {
            System.out.print(arrayOfCoordinates.getCoordinatesOfPoints()[i] + " ");
            countLn++;
            if (countLn == 2) {
                System.out.println();
                countLn = 0;
            }
        }

        System.out.println();
        Determinable determinable = Determinable::determineTeMaxRadius;
        System.out.printf("Maximal radius is %.2f", determinable.determine(arrayOfCoordinates));

    }

}
