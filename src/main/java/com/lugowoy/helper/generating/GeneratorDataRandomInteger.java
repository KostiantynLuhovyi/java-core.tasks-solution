package com.lugowoy.helper.generating;

/** Created by Konstantin Lugowoy on 24.07.2017. */

public interface GeneratorDataRandomInteger extends GeneratorDataRandom {

    static int generateInt() {
        return RANDOM.nextInt();
    }

    static int generateInt(int bound) {
        if (bound < Integer.MAX_VALUE) {
            return RANDOM.nextInt(bound);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static int generateInt(int minBound, int maxBound) {
        if ((minBound > Integer.MIN_VALUE) && (maxBound < Integer.MAX_VALUE)) {
            return (minBound + (RANDOM.nextInt((maxBound - minBound) + 1)));
        } else {
            throw new IllegalArgumentException();
        }
    }

}
