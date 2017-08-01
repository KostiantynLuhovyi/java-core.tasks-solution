package com.lugowoy.helper.generating;

/** Created by Konstantin Lugowoy on 24.07.2017. */

public interface GeneratorDataRandomDouble extends GeneratorDataRandom {

    static double generateDouble() {
        return RANDOM.nextDouble();
    }

    static double generateDouble(double bound) {
        if (bound <= Double.MAX_VALUE) {
            return (0 + (RANDOM.nextDouble() * (bound - 0)));
        } else {
            throw new IllegalArgumentException();
        }
    }

    static double generateDouble(double minBound, double maxBound) {
        if ((minBound >= Double.MIN_VALUE) && (maxBound <= Double.MAX_VALUE)) {
            return (minBound + (RANDOM.nextDouble() * (maxBound - minBound)));
        } else {
            throw new IllegalArgumentException();
        }
    }

}
