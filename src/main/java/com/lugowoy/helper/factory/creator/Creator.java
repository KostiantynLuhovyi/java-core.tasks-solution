package com.lugowoy.helper.factory.creator;

import com.lugowoy.helper.factory.Factory;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public abstract class Creator<T> {

    private Factory<T> factory;

    public Creator(Factory<T> factory) {
        this.factory = factory;
    }

    abstract T create();

    public Factory<T> getFactory() {
        return factory;
    }

}
