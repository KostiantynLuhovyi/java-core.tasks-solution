package com.lugowoy.util.filling.arrays;

import com.lugowoy.util.filling.Fillable;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public interface FillableArray<T> extends Fillable {

    T[] fillArray(T[] t);

    int[] fillArray(int[] intArray);

    double[] fillArray(double[] doubleArray);

}
