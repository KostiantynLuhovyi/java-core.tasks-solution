package com.lugowoy.tasks.calculateDistanceFromPointToStraightLineInPlane;

import com.lugowoy.helper.factory.creator.Creator;
import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 11.07.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    private static final Creator<Point<Double>> CREATOR = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates());

    private static final String POINT_M = "M";
    private static final String POINT_A = "A";

    public static void main(String[] args) {

        Point<Double> pointM = getPoint(POINT_M);
        Point<Double> pointA = getPoint(POINT_A);

        Point<Double> pointO = CREATOR.create();

        if (isDifferent(pointO, pointA)) {
            System.out.printf("Distance from point M(%.2f, %.2f) to line OA is equal : %.2f .",
                                                                 pointM.getCoordinateX(), pointM.getCoordinateY(),
                                                                    getDistanceFromPointToLine(pointM, pointA, pointO));
        } else {
            System.out.println("The coordinates of point O are equal to the coordinates of point A. " +
                                                                       "For this reason, calculations are impossible.");
        }

    }

    private static Point<Double> getPoint(String pointName) {
        Point<Double> point = CREATOR.create();

        System.out.println("Enter coordinates for point " + pointName + " : ");
        System.out.println("x : ");
        point.setCoordinateX(reader.readDouble());
        System.out.println("y : ");
        point.setCoordinateY(reader.readDouble());

        return point;
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

}
