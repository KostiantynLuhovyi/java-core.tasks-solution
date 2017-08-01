package com.lugowoy.helper.factory.creator;

import com.lugowoy.helper.factory.FactorableOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfArrayModels;
import com.lugowoy.helper.factory.models.FactoryOfModels;
import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class CreatorOfArrayModels<T> extends CreatorOfModels<Array<T>> implements FactorableOfArrayModels<T> {

    public CreatorOfArrayModels(FactoryOfModels<Array<T>> factory) {
        super(factory);
    }

    @Override
    Array<T> create() {
        return super.getFactory().create();
    }

    @Override
    public Array<T> create(T[] array) {
        return ((FactoryOfArrayModels<T>)super.getFactory()).create(array);
    }

    @Override
    public Array<T> create(int length) {
        return ((FactoryOfArrayModels<T>)super.getFactory()).create(length);
    }

}
