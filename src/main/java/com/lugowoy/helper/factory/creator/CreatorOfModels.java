package com.lugowoy.helper.factory.creator;

import com.lugowoy.helper.factory.models.FactoryOfModels;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public abstract class CreatorOfModels<T> extends Creator<T> {

    public CreatorOfModels(FactoryOfModels<T> factory) {
        super(factory);
    }

}
