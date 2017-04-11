package com.lugowoy.tasks.arrays.getIntegersInAscendingOrderThatDoesNotBelongToThisArray;

/** Created by Konstantin Lugowoy on 11.04.2017. */

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
