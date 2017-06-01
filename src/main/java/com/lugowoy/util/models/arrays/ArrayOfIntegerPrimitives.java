package com.lugowoy.util.models.arrays;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public class ArrayOfIntegerPrimitives extends Array<Integer> {

    private int[] array;

    public ArrayOfIntegerPrimitives() {
        super();
    }

    public ArrayOfIntegerPrimitives(Integer[] array) {
        super();
        this.array = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    public ArrayOfIntegerPrimitives(int[] array) {
        super();
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayOfIntegerPrimitives)) return false;
        if (!super.equals(o)) return false;

        ArrayOfIntegerPrimitives that = (ArrayOfIntegerPrimitives) o;

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
        return "ArrayOfIntegerPrimitives[" +
                "array=" + Arrays.toString(array) +
                ']';
    }

    @Override
    protected ArrayOfIntegerPrimitives clone() throws CloneNotSupportedException {
        ArrayOfIntegerPrimitives arrayIntegerPrimitive = (ArrayOfIntegerPrimitives) super.clone();
        arrayIntegerPrimitive.array = this.getArrayOfIntegerPrimitives();
        return arrayIntegerPrimitive;
    }

    @Override
    public Integer[] getArray() {
        return Arrays.stream(this.array).boxed().toArray(Integer[]::new);
    }

    @Override
    public int[] getArrayOfIntegerPrimitives() {
        return this.array;
    }

    @Override
    public void setArray(Integer[] array) {
        this.array = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    @Override
    public void setArrayOfIntegerPrimitives(int[] arrayOfIntegerPrimitives) {
        this.array = arrayOfIntegerPrimitives;
    }

}

