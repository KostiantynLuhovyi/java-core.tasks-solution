package com.lugowoy.tasks.arrays.onedimensional.createNewArrayFromTheUniqueElementsOfTheOriginalArray;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 29.05.2017. */

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

        DeterminableUniqueness<Array<Integer>, Integer> determinableUniqueness = DeterminableUniqueness::determineTheUniqueElementsOfTheOriginalArray;

        Creator<Array<Integer>, Integer> creator = new CreatorArray<>(determinableUniqueness);
        Array<Integer> newArrayFromTheUniqueElements = creator.create(array);

        System.out.println("New array from the unique elements : ");
        Arrays.stream(newArrayFromTheUniqueElements.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }

}
