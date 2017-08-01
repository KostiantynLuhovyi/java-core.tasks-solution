package com.lugowoy.helper.factory;

import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public interface FactorableOfArrayModels<T> extends FactorableOfModels<Array<T>> {

    Array<T> create(T[] array);

    Array<T> create(int length);

}
