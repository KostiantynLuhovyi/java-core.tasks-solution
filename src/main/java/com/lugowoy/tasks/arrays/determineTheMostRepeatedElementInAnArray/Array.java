package com.lugowoy.tasks.arrays.determineTheMostRepeatedElementInAnArray;

/** Created by Konstantin Lugowoy on 22.03.2017. */

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
