package com.lugowoy.util.filling.arrays;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 15-Feb-17.*/

public class FillingArrayOfRandomNumber<T extends Number> extends FillingArray<T> {

    public FillingArrayOfRandomNumber() {
    }

    public FillingArrayOfRandomNumber(Reading<T> reading) {
        super(reading);
    }

    @Override
    public T[] fillArray(T[] tArray) {
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = super.getReadingData().read();
        }
        return tArray;
    }

    @Override
    public int[] fillArray(int[] intArray) {
        ReadingData<Integer> readingData = new ReadingData<>(new ReadingRandomData()::readInt);
        intArray = Arrays.stream(new Integer[intArray.length]).mapToInt(value -> readingData.read()).toArray();
        return intArray;
    }

    @Override
    public int[] fillArray(int[] intArray, int bound) {
        ReadingRandomData randomData = new ReadingRandomData();
        intArray = Arrays.stream(new Integer[intArray.length]).mapToInt(value -> randomData.readInt(bound)).toArray();
        return intArray;
    }

    @Override
    public int[] fillArray(int[] intArray, int minBound, int maxBound) {
        Random random = new Random();
        intArray = Arrays.stream(new Integer[intArray.length]).mapToInt(value -> (minBound + (random.nextInt((maxBound - minBound) + 1)))).toArray();
        return intArray;
    }

    @Override
    public double[] fillArray(double[] doubleArray) {
        ReadingData<Double> readingData = new ReadingData<>(new ReadingRandomData()::readDouble);
        return Arrays.stream(new Double[doubleArray.length])
                     .mapToDouble(value -> readingData.read()).toArray();
    }

    @Override
    public double[] fillArray(double[] doubleArray, double minBound, double maxBound) {
        doubleArray = Arrays.stream(new Double[doubleArray.length]).mapToDouble(value -> (minBound + (Math.random() * (maxBound - minBound)) + 1)).toArray();
        return doubleArray;
    }

}
