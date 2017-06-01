package com.lugowoy.util.filling.arrays;

/** Created by Konstantin Lugowoy on 01.06.2017. */

public interface FillableArrayOfRandomNumber {

    int[] fillArray(int[] intArray, int bound);

    int[] fillArray(int[] intArray, int minBound, int maxBound);

    double[] fillArray(double[] doubleArray, double minBound, double maxBound);

}
