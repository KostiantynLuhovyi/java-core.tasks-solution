package com.lugowoy.tasks.arrays.defineRingWithTheCenterAtTheOriginWhichContainsAllThePoints;

import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 16.05.2017. */

public class Main {

    private static final ReadingUserInputData READING_DATA = new ReadingUserInputData();

    public static void main(String[] args) {

        ArrayOfCoordinates<Double> arrayOfCoordinates = new ArrayOfCoordinates<>();

        System.out.println("Enter the number of points for the task : ");
        int numberQuantityPoints = READING_DATA.readInt();


        ReadingRandomData randomData = new ReadingRandomData();
        arrayOfCoordinates.setArrayOfCoordinates(Arrays.stream(new Double[numberQuantityPoints * 2])
                                                       .mapToDouble(value -> value = randomData.readDouble())
                                                       .boxed()
                                                       .toArray(Double[]::new));


        System.out.println("Coordinates of points : ");
        int countLn = 0;
        for (int i = 0; i < arrayOfCoordinates.getArrayOfCoordinates().length; i++) {
            System.out.print(arrayOfCoordinates.getArrayOfCoordinates()[i] + " ");
            countLn++;
            if (countLn == 2) {
                System.out.println();
                countLn = 0;
            }
        }

        Determinable<Double> determinable = Determinable::determineRingWhichContainsAllCoordinatesOfPoints;
        determinable.determine(arrayOfCoordinates);

    }

}
