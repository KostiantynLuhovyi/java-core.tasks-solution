package com.lugowoy.tasks.arrays.createAnArrayOfZeroElementsOfAnotherArray;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

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
