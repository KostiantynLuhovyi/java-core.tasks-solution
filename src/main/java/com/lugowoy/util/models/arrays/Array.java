package com.lugowoy.util.models.arrays;

import com.lugowoy.util.models.Model;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public abstract class Array<T> extends Model {

    public Array() {
        super();
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

    public T[] getArray() {
        throw new RuntimeException("Not realize method.");
    }

    public int[] getArrayOfIntegerPrimitives() {
        throw new RuntimeException("Not realize method.");
    }

    public double[] getArrayOfDoublePrimitives() {
        throw new RuntimeException("Not realize method.");
    }

    public void setArray(T[] array) {
        throw new RuntimeException("Not realize method.");
    }

    public void setArrayOfIntegerPrimitives(int[] arrayOfIntegerPrimitives) {
        throw new RuntimeException("Not realize method.");
    }

    public void setArrayOfDoublePrimitives(double[] arrayOfDoublePrimitives) {
        throw new RuntimeException("Not realize method.");
    }

}
