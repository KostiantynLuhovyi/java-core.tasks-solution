package com.lugowoy.util.factory;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public interface FactoryArrayOfPrimitives<T> extends Factory<Array<T>> {

    Array<T> create(T[] array);

    default Array<T> create(int[] intArray) {
        throw new RuntimeException("Not realize method.");
    }

    default Array<T> create(double[] doubleArray) {
        throw new RuntimeException("Not realize method.");
    }

}
