package com.lugowoy.util.filling.arrays;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingData;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public abstract class FillingArray<T> implements FillableArray<T>, FillableArrayOfRandomNumber {

    private ReadingData<T> readingData;

    public FillingArray() {
    }

    public FillingArray(Reading<T> reading) {
        this.readingData = new ReadingData<>(reading);
    }

    @Override
    public abstract T[] fillArray(T[] t);

    @Override
    public abstract int[] fillArray(int[] intArray);

    @Override
    public abstract double[] fillArray(double[] doubleArray);

    @Override
    public int[] fillArray(int[] intArray, int bound) {
        throw new RuntimeException("Not realize method.");
    }

    @Override
    public int[] fillArray(int[] intArray, int minBound, int maxBound) {
        throw new RuntimeException("Not realize method.");
    }

    @Override
    public double[] fillArray(double[] doubleArray, double minBound, double maxBound) {
        throw new RuntimeException("Not realize method.");
    }

    public ReadingData<T> getReadingData() {
        return this.readingData;
    }

    protected void setReadingData(Reading<T> reading) {
        this.readingData = new ReadingData<>(reading);
    }

}
