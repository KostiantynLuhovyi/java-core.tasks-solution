package com.lugowoy.tasks.arrays.onedimensional.findIndicesOfMostRemoteAndLeastDistantPoints;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArraysOfObjects;
import com.lugowoy.util.factory.creating.points.CreatePointDoubleCoordinates;
import com.lugowoy.util.factory.creating.points.CreatorPoint;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03.07.2017. */

public class Main {

    private static CreatorArray<Point<Double>> creatorArray = new CreatorArraysOfObjects<>();
    private static CreatorPoint<Double> creatorPoint = new CreatePointDoubleCoordinates();
    private static ReadingData<Double> readingData = new ReadingData<>(new ReadingRandomData()::readDouble);

    public static void main(String[] args) {

        int numberQuantityPointOfPlane = getNumberQuantityPointsOfPlane();

        Array<Point<Double>> pointsArray = creatorArray.create(new Point[numberQuantityPointOfPlane]);

        fillArrayPoints(pointsArray, readingData, creatorPoint);

        System.out.println("\nPoints : ");
        Arrays.stream(pointsArray.getArray()).forEachOrdered(System.out::println);
        System.out.println();

        Findable<Array<Point<Double>>> findable = Findable::findIndicesOfMaxDistanceBetweenPoints;
        findable.find(pointsArray);

        System.out.println();

        findable = Findable::findIndicesOfMinDistanceBetweenPoints;
        findable.find(pointsArray);

    }

    private static int getNumberQuantityPointsOfPlane() {
        System.out.println("Enter the number quantity points of the plane : ");
        int numberQuantityPointOfPlane;
        ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);
        while (true) {
            numberQuantityPointOfPlane = readingData.read();
            if ((numberQuantityPointOfPlane > 0) && (numberQuantityPointOfPlane % 2 == 0)) {
                break;
            } else {
                System.out.println("The number quantity points of the plane a must be positive and even number.");
                System.out.println("Re-enter : ");
            }
        }
        return numberQuantityPointOfPlane;

    }

    private static void fillArrayPoints(Array<Point<Double>> pointArray, ReadingData<Double> readingData, CreatorPoint<Double> creatorPoint) {
        for (int i = 0; i < pointArray.getArray().length; i++) {
            double coorX = readingData.read(), coorY = readingData.read();
            pointArray.getArray()[i] = creatorPoint.create(coorX, coorY);
        }

    }

}
