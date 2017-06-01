package com.lugowoy.util.models;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public abstract class Model implements Cloneable, Serializable {

    public Model() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
