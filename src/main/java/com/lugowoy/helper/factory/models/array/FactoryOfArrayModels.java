package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.factory.FactorableOfArrayModels;
import com.lugowoy.helper.factory.models.FactoryOfModels;
import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 31.07.2017. */

public abstract class FactoryOfArrayModels<T> extends FactoryOfModels<Array<T>> implements FactorableOfArrayModels<T> {

    @Override
    public abstract Array<T> create(T[] array);

    @Override
    public abstract Array<T> create(int lengthArray);

}
