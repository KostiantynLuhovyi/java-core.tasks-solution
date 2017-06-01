package com.lugowoy.util.factory.creating.arrays;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public abstract class CreatorArrayOfPrimitives<T> extends CreatorArray<T> {

    @Override
    public abstract Array<T> create();

    @Override
    public abstract Array<T> create(T[] array);

    @Override
    public Array<T> create(int[] intArray) {
        throw new RuntimeException("Not realize method.");
    }

    @Override
    public Array<T> create(double[] doubleArray) {
        throw new RuntimeException("Not realize method.");
    }

}
