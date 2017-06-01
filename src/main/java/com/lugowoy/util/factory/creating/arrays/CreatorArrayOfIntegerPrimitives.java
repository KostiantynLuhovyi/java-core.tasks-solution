package com.lugowoy.util.factory.creating.arrays;

import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.arrays.ArrayOfIntegerPrimitives;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public class CreatorArrayOfIntegerPrimitives extends CreatorArrayOfPrimitives<Integer> {

    @Override
    public Array<Integer> create() {
        return new ArrayOfIntegerPrimitives();
    }

    @Override
    public Array<Integer> create(Integer[] array) {
        return new ArrayOfIntegerPrimitives(array);
    }

    @Override
    public Array<Integer> create(int[] intArray) {
        return new ArrayOfIntegerPrimitives(intArray);
    }

}
