package com.lugowoy.tasks.arrays.outputElementsOfIndexesWhichAreDegreeOfTwo;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 01.03.2017. */

public class Main {

    private static final FillableArray<Integer> FILLABLE_ARRAY
            = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Integer[] integersArray = FILLABLE_ARRAY.fillArray(new Integer[50]);

        System.out.println("Original : ");
        Arrays.stream(integersArray).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Result : ");
        output(integersArray);

    }

    private static void output(Integer[] integers) {
        for (int i = 0; i < integers.length; i++) {
            if (i > 1 && i % 2 == 0) System.out.println("Index : " + i + " = " + "value : " + integers[i]);
        }
    }
}
