package com.lugowoy.tasks.arrays.onedimensional.specifySetOfTrianglesWithVerticesAtGivenPointsThatIntersectWithCircle;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArraysOfObjects;
import com.lugowoy.util.factory.creating.points.CreatePointIntegerCoordinates;
import com.lugowoy.util.factory.creating.points.CreatorPoint;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class Main {

    private static CreatorArray<Point<Integer>> creatorArray = new CreatorArraysOfObjects<>();
    private static CreatorPoint<Integer> creatorPoint = new CreatePointIntegerCoordinates();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        int quantityOfPoints = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray("Enter the number of points on the plane : ");

        Array<Point<Integer>> pointsArray = creatorArray.create(new Point[quantityOfPoints]);

        fillPointsArray(pointsArray, creatorPoint, readingData);

        System.out.println();
        System.out.println("Points : ");
        Arrays.stream(pointsArray.getArray()).forEachOrdered(System.out::println);
        System.out.println();

        double radius = getRadius();

        System.out.println();
        System.out.println("Result : ");
        TrigonometricDeterminable<Array<Point<Integer>>, Double> trigonometricDeterminable = TrigonometricDeterminable::determineSetOfTrianglesWithVerticesAtGivenPointsThatIntersectWithCircle;
        trigonometricDeterminable.determine(pointsArray, radius);

    }

    private static double getRadius() {
        System.out.println("Enter the radius of the circle : ");
        double radius;
        while (true) {
            radius = new ReadingUserInputData().readInt();
            if (radius > 50) {
                break;
            } else {
                System.out.println("The radius of the circle must be greater than 50.");
                System.out.println("Re-enter : ");
            }
        }
        return radius;

    }

    private static void fillPointsArray(Array<Point<Integer>> pointsArray, CreatorPoint<Integer> creatorPoint, ReadingData<Integer> readingData) {
        for (int i = 0; i < pointsArray.getArray().length; i++) {
            pointsArray.getArray()[i] = creatorPoint.create(readingData.read(), readingData.read());
        }

    }

}
