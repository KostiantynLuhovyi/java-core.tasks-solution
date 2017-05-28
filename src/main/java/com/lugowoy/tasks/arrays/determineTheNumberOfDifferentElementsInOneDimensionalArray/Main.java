package com.lugowoy.tasks.arrays.determineTheNumberOfDifferentElementsInOneDimensionalArray;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 28.05.2017. */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Array<Integer> array = new Array<>(Arrays.stream(new Integer[30])
                                                 .mapToInt(value -> value = READING_DATA.read())
                                                 .boxed()
                                                 .toArray(Integer[]::new));

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Determinable<Integer> determinable = Determinable::determineTheNumberOfDifferentElementsInOneDimensionalArray;
        int numberOfDifferentElements = determinable.determine(array);

        System.out.printf("In a one-dimensional array of %d different elements", numberOfDifferentElements);

    }
}
