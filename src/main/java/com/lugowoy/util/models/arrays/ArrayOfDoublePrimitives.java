package com.lugowoy.util.models.arrays;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 31.05.2017. */

public class ArrayOfDoublePrimitives extends Array<Double> {

    private double[] array;

    public ArrayOfDoublePrimitives() {
        super();
    }

    public ArrayOfDoublePrimitives(Double[] array) {
        super();
        this.array = Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }

    public ArrayOfDoublePrimitives(double[] array) {
        super();
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayOfDoublePrimitives)) return false;
        if (!super.equals(o)) return false;

        ArrayOfDoublePrimitives that = (ArrayOfDoublePrimitives) o;

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
    protected ArrayOfDoublePrimitives clone() throws CloneNotSupportedException {
        ArrayOfDoublePrimitives arrayDoublePrimitive = (ArrayOfDoublePrimitives) super.clone();
        arrayDoublePrimitive.array = this.getArrayOfDoublePrimitives();
        return arrayDoublePrimitive;
    }

    @Override
    public Double[] getArray() {
        return Arrays.stream(this.array).boxed().toArray(Double[]::new);
    }

    @Override
    public double[] getArrayOfDoublePrimitives() {
        return this.array;
    }

    @Override
    public void setArray(Double[] array) {
        this.array = Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }

    @Override
    public void setArrayOfDoublePrimitives(double[] arrayOfDoublePrimitives) {
        this.array = arrayOfDoublePrimitives;
    }
}
