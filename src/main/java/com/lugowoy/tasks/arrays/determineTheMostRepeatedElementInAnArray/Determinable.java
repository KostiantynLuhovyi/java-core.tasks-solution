package com.lugowoy.tasks.arrays.determineTheMostRepeatedElementInAnArray;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 22.03.2017. */

@FunctionalInterface
public interface Determinable<T> {

    void determine(Array<T> array);
}
