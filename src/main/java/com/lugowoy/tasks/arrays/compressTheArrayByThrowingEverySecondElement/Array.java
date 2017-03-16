package com.lugowoy.tasks.arrays.compressTheArrayByThrowingEverySecondElement;

/** Created by Konstantin Lugowoy on 13.03.2017. */

public class Array<T> {

    private T[] array;

    public Array() {
    }

    public Array(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}
