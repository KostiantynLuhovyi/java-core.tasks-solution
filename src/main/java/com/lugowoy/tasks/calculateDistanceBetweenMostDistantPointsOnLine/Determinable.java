package com.lugowoy.tasks.calculateDistanceBetweenMostDistantPointsOnLine;

import java.util.Arrays;
import java.util.Optional;

/** Created by Konstantin Lugowoy on 10.07.2017. */

@FunctionalInterface
public interface Determinable<T> {

    T determine(T[] t);

    static Double determineMin(Double[] doubles) {
        Optional<Double> optional = Arrays.stream(doubles).min(Double::compareTo);
        double minNumber;
        if (optional.isPresent()) {
            minNumber = optional.get();
        } else {
            throw new NotDetermineValueException("Can not determine the minimal value.");
        }
        return minNumber;
    }

    static Double determineMax(Double[] doubles) {
        Optional<Double> optional = Arrays.stream(doubles).max(Double::compareTo);
        double maxNumber;
        if (optional.isPresent()) {
            maxNumber = optional.get();
        } else {
            throw new NotDetermineValueException("Can not determine the maximum value.");
        }
        return maxNumber;
    }

    class NotDetermineValueException extends RuntimeException {

        NotDetermineValueException(String message) {
            super(message);
        }

    }

}
