package com.lugowoy.tasks.arrays.onedimensional.defineTriangleForWhichDifferenceInNumberOfPointsOutsideAndInsideIsMinimal;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfDoublePrimitives;
import com.lugowoy.util.factory.creating.arrays.CreatorArraysOfObjects;
import com.lugowoy.util.factory.creating.points.CreatorPointDoubleCoordinates;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 03.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = getSizeArray();

        Array<Double> array = new CreatorArrayOfDoublePrimitives().create(new FillingArrayOfRandomNumber().fillArray(new double[sizeArray], -50, 50));

        System.out.println("Coordinates : ");
        System.out.println(array);
        System.out.println();

        Array<Point<Double>> pointArray = createAndFillArrayOfPoints(array);

        System.out.println("Points : ");
        System.out.println(pointArray);
        System.out.println();

        Definable<Array<Point<Double>>> arrayDefinable = Definable::defineTriangle;
        Array<Point<Double>> resultPointArray = arrayDefinable.define(pointArray);

        System.out.println("Result points of triangle : ");
        Arrays.stream(resultPointArray.getArray()).forEachOrdered(System.out::println);

    }

     public static int getSizeArray() {
        System.out.println("Enter the size of the array : ");
        int sizeArray;
        while (true) {
            sizeArray = new ReadingUserInputData().readInt();
            if (sizeArray % 2 == 0) {
                break;
            } else {
                System.out.println("Number of the size array must be a even number.");
                System.out.println("Re-enter : ");
            }
        }
        return sizeArray;

    }

     private static Point<Double> fillPointCoordinates(double xCoor, double yCoor) {
        return new CreatorPointDoubleCoordinates().create(xCoor, yCoor);
     }

    @SuppressWarnings("unchecked")
    private static Array<Point<Double>> createAndFillArrayOfPoints(Array<Double> arrayOfCoordinates) {
        List<Point<Double>> pointList = new ArrayList<>();
        int countForCreate = 0;
        for (int i = 0; i < arrayOfCoordinates.getArray().length; i++) {
            if (countForCreate == 1) {
                pointList.add(fillPointCoordinates(arrayOfCoordinates.getArray()[i - 1], arrayOfCoordinates.getArray()[i]));
                countForCreate--;
            } else {
                countForCreate++;
            }
        }
        return new CreatorArraysOfObjects<Point<Integer>>().create(pointList.stream().toArray(Point[]::new));

    }

}
