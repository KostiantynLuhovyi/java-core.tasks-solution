package com.lugowoy.util.models.arrays;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public class ArrayOfObjects<T> extends Array<T> {

    private T[] array;

    public ArrayOfObjects() {
        super();
    }

    public ArrayOfObjects(T[] array) {
        super();
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayOfObjects)) return false;
        if (!super.equals(o)) return false;

        ArrayOfObjects<?> that = (ArrayOfObjects<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(getArray());
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "[" +
                "array=" + Arrays.toString(array) +
                ']';
    }

    @Override
    protected ArrayOfObjects clone() throws CloneNotSupportedException {
        ArrayOfObjects arrayOfObjects = (ArrayOfObjects) super.clone();
        arrayOfObjects.array = this.getArray();
        return arrayOfObjects;
    }

    @Override
    public T[] getArray() {
        return this.array;
    }

    @Override
    public void setArray(T[] array) {
        this.array = array;
    }

}
