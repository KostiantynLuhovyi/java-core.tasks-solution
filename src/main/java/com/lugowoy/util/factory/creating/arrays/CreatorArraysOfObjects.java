package com.lugowoy.util.factory.creating.arrays;

import com.lugowoy.util.factory.FactoryArrayOfObjects;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.arrays.ArrayOfObjects;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public class CreatorArraysOfObjects<T> implements FactoryArrayOfObjects<T> {

    @Override
    public Array<T> create() {
        return new ArrayOfObjects<>();
    }

    @Override
    public Array<T> create(T[] array) {
        return new ArrayOfObjects<>(array);
    }

}
