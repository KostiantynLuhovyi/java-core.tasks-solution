package com.lugowoy.util.factory.creating.arrays;

import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.arrays.ArrayOfDoublePrimitives;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public class CreatorArrayOfDoublePrimitives extends CreatorArrayOfPrimitives<Double> {

    @Override
    public Array<Double> create() {
        return new ArrayOfDoublePrimitives();
    }

    @Override
    public Array<Double> create(Double[] array) {
        return new ArrayOfDoublePrimitives(array);
    }

    @Override
    public Array<Double> create(double[] doubleArray) {
        return new ArrayOfDoublePrimitives(doubleArray);
    }

}
