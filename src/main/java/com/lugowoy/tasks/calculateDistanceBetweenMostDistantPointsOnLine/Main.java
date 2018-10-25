package com.lugowoy.tasks.calculateDistanceBetweenMostDistantPointsOnLine;

import com.lugowoy.helper.calculating.CalculationUsingTwoParameters;
import com.lugowoy.helper.filling.array.numbers.FillingArrayReadDoubleNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Main {

    private static final int LENGTH_ARRAY = 3;

    public static void main(String[] args) {

        System.out.println("Enter numbers that are the values of points on the line : ");
        Line<Double> line = new Line<>(new FillingArrayReadDoubleNumbers(new ReadingConsole()).fill(LENGTH_ARRAY));

        Determinant<Double> determinator = Determinant::determineMinValueOfPointOnLine;
        line.setValueMinPoint(determinator.determine(line));

        determinator = Determinant::determineMaxValueOfPointOnLine;
        line.setValueMaxPoint(determinator.determine(line));

        System.out.println("Values of points on the line : ");
        Arrays.stream(line.getPointsOnLine()).forEachOrdered(valuePoint -> System.out.print(valuePoint + " "));

        double distanceBetweenMaxAndMinPoint = CALCULATING.calculate(line.getValueMinPoint(), line.getValueMaxPoint());

        System.out.println("Distance between max and min values of points is equal : " + distanceBetweenMaxAndMinPoint);
    }

    private static final CalculationUsingTwoParameters<Double, Double, Double> CALCULATING
                                                      = (valueMinPoint, valueMaxPoint) -> valueMaxPoint - valueMinPoint;

}
