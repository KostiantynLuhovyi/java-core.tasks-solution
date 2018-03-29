package com.lugowoy.tasks.calculateDistanceBetweenMostDistantPointsOnLine;

import java.util.Arrays;
import java.util.Optional;

/** Created by Konstantin Lugowoy on 10.07.2017. */

@FunctionalInterface
public interface Determinant<T extends Number> {

    T determine(Line<T> line);

    static Double determineMinValueOfPointOnLine(Line<Double> line) throws NotDetermineValueException {
        Optional<Double> optionalMinValueOfPoint = Arrays.stream(line.getPointsOnLine()).min(Double::compareTo);
        if (optionalMinValueOfPoint.isPresent()) {
            return optionalMinValueOfPoint.get();
        } else {
            throw new NotDetermineValueException("Can not determine the minimal value of point on the line.");
        }
    }

    static Double determineMaxValueOfPointOnLine(Line<Double> line) throws NotDetermineValueException {
        Optional<Double> optionalMaxValueOfPoint = Arrays.stream(line.getPointsOnLine()).max(Double::compareTo);
        if (optionalMaxValueOfPoint.isPresent()) {
            return optionalMaxValueOfPoint.get();
        } else {
            throw new NotDetermineValueException("Can not determine the maximum value of point on the line.");
        }
    }

    class NotDetermineValueException extends RuntimeException {

        NotDetermineValueException(String message) {
            super(message);
        }

    }

}
