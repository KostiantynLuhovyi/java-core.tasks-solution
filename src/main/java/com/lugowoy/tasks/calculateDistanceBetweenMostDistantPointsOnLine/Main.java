package com.lugowoy.tasks.calculateDistanceBetweenMostDistantPointsOnLine;

import com.lugowoy.helper.calculating.CalculationUsingTwoParameters;
import com.lugowoy.helper.filling.FillingArrayDoubleUserInputNumbers;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Main {

    private static final int LENGTH_ARRAY = 2;

    public static void main(String[] args) {

        System.out.println("Enter numbers that are the coordinates of points on the line : ");
        Line<Double> line = new Line<>(new FillingArrayDoubleUserInputNumbers().fill(LENGTH_ARRAY));

        Determinable<Double> determinable = Determinable::determineMin;
        line.setValueMinPoint(determinable.determine(line.getPointsOnLine()));

        determinable = Determinable::determineMax;
        line.setValueMaxPoint(determinable.determine(line.getPointsOnLine()));

        System.out.println("Value points on the line : ");
        Arrays.stream(line.getPointsOnLine()).forEachOrdered(valuePoint -> System.out.print(valuePoint + " "));

        double distanceBetweenMaxAndMinPoint
                = calculatingDistanceBetweenTwoPointsOnLine.calculate(line.getValueMinPoint(), line.getValueMaxPoint());

        System.out.println("Distance between max and min point is equal : " + distanceBetweenMaxAndMinPoint);

    }

    private static CalculationUsingTwoParameters<Double, Double, Double> calculatingDistanceBetweenTwoPointsOnLine
                                                      = (valueMinPoint, valueMaxPoint) -> valueMaxPoint - valueMinPoint;

}
