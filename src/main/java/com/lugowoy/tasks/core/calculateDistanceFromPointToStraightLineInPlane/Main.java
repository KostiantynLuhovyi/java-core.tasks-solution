package com.lugowoy.tasks.core.calculateDistanceFromPointToStraightLineInPlane;

import com.lugowoy.util.factory.creating.points.CreatorPointDoubleCoordinates;
import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 11.07.2017. */

public class Main {

    public static void main(String[] args) {

        Point<Double> pointM = getPoint("M");
        Point<Double> pointA = getPoint("A");

        Point<Double> pointO = new CreatorPointDoubleCoordinates().create(0d, 0d);

        double distanceFromPointToLine = 0;
        if (isDifferent(pointO, pointA)) {
            distanceFromPointToLine = getDistanceFromPointToLine(pointM, pointA, pointO);
            /*(((pointA.getCoordinateX() - pointO.getCoordinateX()) * pointM.getCoordinateY())
                + (pointA.getCoordinateY() - pointO.getCoordinateY() * pointM.getCoordinateX()) + (pointA.getCoordinateY() * pointO.getCoordinateX() - pointO.getCoordinateY() * pointA.getCoordinateX()))
                    / Math.sqrt(pointA.getCoordinateY() * pointO.getCoordinateY() + pointA.getCoordinateX() * pointO.getCoordinateX());
     */   }

        System.out.printf("Distance from point M(%.2f, %.2f) to line is equal : %.2f .", pointM.getCoordinateX(), pointM.getCoordinateY(), distanceFromPointToLine);

    }

    private static Point<Double> getPoint(String pointName) {
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);
        Point<Double> point = new CreatorPointDoubleCoordinates().create();

        System.out.println("Enter coordinates for point " + pointName + " : ");
        System.out.println("x : ");
        point.setCoordinateX(readingData.read());
        System.out.println("y : ");
        point.setCoordinateY(readingData.read());

        return point;

    }

    private static boolean isDifferent(Point firstPoint, Point secondPoint) {
        return !firstPoint.equals(secondPoint);
    }

    private static double getDistanceFromPointToLine(Point<Double> pointM, Point<Double> pointA, Point<Double> pointO) {
        double distanceFromPointToLine, A, B, C;

        A = pointA.getCoordinateY() - pointO.getCoordinateY();
        B = pointA.getCoordinateX() - pointO.getCoordinateX();
        C = pointA.getCoordinateY() * pointO.getCoordinateX() - pointO.getCoordinateY() * pointA.getCoordinateX();

        distanceFromPointToLine = (A * pointM.getCoordinateX() + B * pointM.getCoordinateY() + C) / Math.sqrt(A * A + B * B);

        return distanceFromPointToLine;

    }

}
