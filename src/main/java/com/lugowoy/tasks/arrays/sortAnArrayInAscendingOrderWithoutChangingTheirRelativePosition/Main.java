package com.lugowoy.tasks.arrays.sortAnArrayInAscendingOrderWithoutChangingTheirRelativePosition;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 14.05.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Array<Integer> array = new Array<>();
        array.setArray(Arrays.stream(new Integer[20])
                             .mapToInt(value -> value = RANDOM.nextInt())
                             .boxed()
                             .toArray(Integer[]::new));

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));

        Sortable<Integer> sortable = Sortable::sortAnArrayInAscendingOrderWithoutChangingTheirRelativePosition;
        sortable.sort(array);

        System.out.println();
        System.out.println("After sorting : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
    }
}
