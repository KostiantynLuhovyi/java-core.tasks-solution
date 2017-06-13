package com.lugowoy.tasks.arrays.insertAnIntegerInTheSequencePositionWithoutViolatingTheIncrease;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public interface Sortable<T> {

    void sort(T[] tArray);

    static void sortingIntegerSequence(Integer[] integers) {
        Arrays.stream(integers).sorted().collect(Collectors.toList()).toArray(integers);
    }

}
