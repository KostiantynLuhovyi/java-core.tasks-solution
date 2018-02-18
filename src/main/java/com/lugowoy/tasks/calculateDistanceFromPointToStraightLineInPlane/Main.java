package com.lugowoy.tasks.calculateDistanceFromPointToStraightLineInPlane;

import com.lugowoy.helper.factory.FactoryPoint;
import com.lugowoy.helper.factory.creator.CreatorPoint;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 11.07.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    private static final String POINT_M = "M";
    private static final String POINT_A = "A";

    public static void main(String[] args) {

        Point<Double> pointM = getPoint(POINT_M);
        Point<Double> pointA = getPoint(POINT_A);

        Point<Double> pointO = FactoryPoint.getFactoryPoint(new CreatorPoint<Double>()).create();

        if (isDifferent(pointO, pointA)) {
            System.out.printf("Distance from point M(%.2f, %.2f) to line OA is equal : %.2f .",
                                                                 pointM.getCoordinateX(), pointM.getCoordinateY(),
                                                                 getDistanceFromPointToLine(pointM, pointA, pointO));
        } else {
            System.err.println("The coordinates of point O are equal to the coordinates of point A. " +
                                                                       "For this reason, calculations are impossible.");
        }

    }

    private static boolean isDifferent(Point firstPoint, Point secondPoint) {
        return !(firstPoint.getCoordinateX().equals(secondPoint.getCoordinateX())
                && firstPoint.getCoordinateY().equals(secondPoint.getCoordinateY()));
    }

    private static double getDistanceFromPointToLine(Point<Double> pointM, Point<Double> pointA, Point<Double> pointO) {
        double distanceFromPointToLine, A, B, C;

        A = pointA.getCoordinateY() - pointO.getCoordinateY();
        B = pointA.getCoordinateX() - pointO.getCoordinateX();
        C = pointA.getCoordinateY() * pointO.getCoordinateX() - pointO.getCoordinateY() * pointA.getCoordinateX();

        distanceFromPointToLine = (A * pointM.getCoordinateX() + B * pointM.getCoordinateY() + C) / Math.sqrt(A * A + B * B);

        return distanceFromPointToLine;
    }

    private static Point<Double> getPoint(String pointName) {
        Point<Double> point = FactoryPoint.getFactoryPoint(new CreatorPoint<Double>()).create();
        try {
            enterCoordinatesOfPoint(pointName, point);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return point;
    }

    private static void enterCoordinatesOfPoint(String pointName, Point<Double> point) throws IllegalArgumentException {
        System.out.println("Enter coordinates for point " + pointName + " : ");
        if (point != null) {
            System.out.println("x : ");
            point.setCoordinateX(READER.readDouble());
            System.out.println("y : ");
            point.setCoordinateY(READER.readDouble());
        } else {
            throw new IllegalArgumentException(
                    new NullPointerException("The object of Point class passed by argument is equal to null."));
        }
    }

}
