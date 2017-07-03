package com.lugowoy.tasks.arrays.onedimensional.createNewArrayFromTheUniqueElementsOfTheOriginalArray;

/** Created by Konstantin Lugowoy on 29.05.2017. */

public class Array<T extends Number> {

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
