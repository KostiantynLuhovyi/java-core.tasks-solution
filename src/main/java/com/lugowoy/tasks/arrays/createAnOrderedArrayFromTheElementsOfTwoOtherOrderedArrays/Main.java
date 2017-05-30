package com.lugowoy.tasks.arrays.createAnOrderedArrayFromTheElementsOfTwoOtherOrderedArrays;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 30.05.2017. */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Array firstArray = new Array(Arrays.stream(new Integer[10])
                                           .mapToInt(value -> value = READING_DATA.read())
                                           .boxed()
                                           .toArray(Integer[]::new));
        Arrays.sort(firstArray.getArray());

        Array secondArray = new Array(Arrays.stream(new Integer[10])
                                            .mapToInt(value -> value = READING_DATA.read())
                                            .boxed()
                                            .toArray(Integer[]::new));
        Arrays.sort(secondArray.getArray());

        System.out.println("Original first array : ");
        Arrays.stream(firstArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Original second array : ");
        Arrays.stream(secondArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Mergeable<Array> mergeable = Mergeable::mergeArrays;
        Array resultArray = mergeable.merge(firstArray, secondArray);

        System.out.println("Result array : ");
        Arrays.stream(resultArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }

}
