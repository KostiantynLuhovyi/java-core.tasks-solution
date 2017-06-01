package com.lugowoy.util.factory;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public interface FactoryArrayOfObjects<T> extends Factory<Array<T>> {

    Array<T> create(T[] array);
}
