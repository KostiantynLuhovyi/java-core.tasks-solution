package com.lugowoy.tasks.core.calculateDistanceFromPointToSingleCircleWithCenterAtGivenPoint;

import com.lugowoy.util.calculating.CalculableOnTheTwoVariables;
import com.lugowoy.util.factory.creating.points.CreatorPointDoubleCoordinates;
import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Main {

    public static void main(String[] args) {

        Point<Double> pointM = getPoint("M");
        Point<Double> pointC = getPoint("C");

        System.out.println(pointM);
        System.out.println(pointC);

        System.out.println();

        double distance = calculatingDistanceFromPointToSingleCircle.calculate(pointM, pointC);

        System.out.printf("If we assume that the point C(%.2f, %.2f) is the center of the unit circle, " +
                        "\n then the distance from the point M(%.2f, %.2f) to the unit circle is %.2f .", pointC.getCoordinateX(), pointC.getCoordinateY(),
                pointM.getCoordinateX(), pointM.getCoordinateY(), distance);

    }

    private static Point<Double> getPoint(String pointName) {
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter coordinates for the point " + pointName + " .");
        Point<Double> point = new CreatorPointDoubleCoordinates().create();

        System.out.println("x : ");
        point.setCoordinateX(readingData.read());
        System.out.println("y : ");
        point.setCoordinateY(readingData.read());

        return point;

    }

    private static CalculableOnTheTwoVariables<Double, Point<Double>, Point<Double>> calculatingDistanceFromPointToSingleCircle = (firstPoint, secondPoint) ->
            sqrt(pow(firstPoint.getCoordinateX() - (secondPoint.getCoordinateX() + 1.0), 2)) + pow(firstPoint.getCoordinateY() - (secondPoint.getCoordinateY() + 1.0), 2);

}
