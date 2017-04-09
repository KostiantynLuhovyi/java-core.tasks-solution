package com.lugowoy.tasks.arrays.compressTheArrayByThrowingEverySecondElement;

/** Created by Konstantin Lugowoy on 13.03.2017. */

@FunctionalInterface
public interface Compressible<T> {

    void compress(T t);
}
