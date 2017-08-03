package com.lugowoy.tasks.core.calculateDistanceBetweenMostDistantPointsOnLine;

import java.util.Arrays;
import java.util.Optional;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public interface Determinable<T> {

    T determine(T[] t);

    static Double determineMin(Double[] doubles) {
        Optional<Double> optional = Arrays.stream(doubles).min(Double::compareTo);
        double minNumber = 0;
        if (optional.isPresent()) {
            minNumber = optional.get();
        } else {
            System.out.println("Have not a min number.");
            System.out.println("Result : 0 .");
        }
        return minNumber;
    }

    static Double determineMax(Double[] doubles) {
        Optional<Double> optional = Arrays.stream(doubles).max(Double::compareTo);
        double maxNumber = 0;
        if (optional.isPresent()) {
            maxNumber = optional.get();
        } else {
            System.out.println("Have not a max number.");
            System.out.println("Result : 0 .");
        }
        return maxNumber;
    }

}
