package com.lugowoy.tasks.arrays.insertAnIntegerInTheSequencePositionWithoutViolatingTheIncrease;

import com.lugowoy.util.models.arrays.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Created by Konstantin Lugowoy on 11.03.2017. */

@FunctionalInterface
public interface Insertable<T> {

    void insert(T t, Array<T> numbers);

    static void insertElement(Integer integer, Array<Integer> integersArray) {
        List<Integer> integerList;
        if ((integer != null) && (integersArray != null)) {
            for (int i = 1; i < integersArray.getArray().length; i++) {
                if (((integer > integersArray.getArray()[i - 1]) || (integer.intValue() == (integersArray.getArray()[i - 1])))
                        && ((integer < integersArray.getArray()[i]) || (integer.intValue() == (integersArray.getArray()[i])))) {
                    integerList = Arrays.stream(integersArray.getArray()).collect(Collectors.toList());
                    integerList.add(i, integer);
                    integersArray.setArray(integerList.toArray(new Integer[integerList.size()]));
                    break;
                }
            }
        }
    }
}
