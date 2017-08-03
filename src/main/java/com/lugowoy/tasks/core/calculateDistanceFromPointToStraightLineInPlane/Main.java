package com.lugowoy.tasks.core.calculateDistanceFromPointToStraightLineInPlane;

import com.lugowoy.helper.factory.creator.Creator;
import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 11.07.2017. */

public class Main {

    private static Creator<Point<Double>> creator = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates());
    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Point<Double> pointM = getPoint("M");
        Point<Double> pointA = getPoint("A");

        Point<Double> pointO = creator.create();

        double distanceFromPointToLine = 0;
        if (isDifferent(pointO, pointA)) {
            distanceFromPointToLine = getDistanceFromPointToLine(pointM, pointA, pointO);
        }

        System.out.printf("Distance from point M(%.2f, %.2f) to line is equal : %.2f .", pointM.getCoordinateX(), pointM.getCoordinateY(), distanceFromPointToLine);

    }

    private static Point<Double> getPoint(String pointName) {
        Point<Double> point = creator.create();

        System.out.println("Enter coordinates for point " + pointName + " : ");
        System.out.println("x : ");
        point.setCoordinateX(reader.readDouble());
        System.out.println("y : ");
        point.setCoordinateY(reader.readDouble());

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
