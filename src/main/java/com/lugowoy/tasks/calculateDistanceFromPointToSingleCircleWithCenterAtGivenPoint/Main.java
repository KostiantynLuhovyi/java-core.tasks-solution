package com.lugowoy.tasks.calculateDistanceFromPointToSingleCircleWithCenterAtGivenPoint;

import com.lugowoy.helper.calculating.CalculationUsingTwoParameters;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    private static final String POINT_M = "M";
    private static final String POINT_C = "C";

    public static void main(String[] args) {

        Point<Double> pointM = getPoint(POINT_M);
        Point<Double> pointC = getPoint(POINT_C);

        System.out.println(pointM);
        System.out.println(pointC);

        System.out.println();

        double distance = CALCULATING.calculate(pointM, pointC);

        System.out.printf("If we assume that the point C(%.2f, %.2f) is the center of the unit circle, " +
                                    "%n then the distance from the point M(%.2f, %.2f) to the unit circle is %.2f .",
                                                                       pointC.getCoordinateX(), pointC.getCoordinateY(),
                                                                       pointM.getCoordinateX(), pointM.getCoordinateY(),
                                                                       distance);

    }

    private static final CalculationUsingTwoParameters<Double, Point<Double>, Point<Double>> CALCULATING
            = (firstPoint, secondPoint) -> sqrt(pow(firstPoint.getCoordinateX() - (secondPoint.getCoordinateX() + 1.0), 2))
                                                + pow(firstPoint.getCoordinateY() - (secondPoint.getCoordinateY() + 1.0), 2);

    private static Point<Double> getPoint(String pointName) {
        Point<Double> point = Point.create();
        enterCoordinatesOfPoint(pointName, point);
        return point;
    }

    private static void enterCoordinatesOfPoint(String pointName, Point<Double> point) {
        if (point != null) {
            System.out.println("Enter coordinates for the points " + pointName + " .");
            System.out.println("x : ");
            point.setCoordinateX(READER.readDouble());
            System.out.println("y : ");
            point.setCoordinateY(READER.readDouble());
        } else {
            System.err.println("The object of Point class passed by argument is equal to null.");
        }
    }

}
