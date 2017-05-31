package com.lugowoy.tasks.arrays.compressAnArrayByThrowingOutNullElements;

import com.lugowoy.util.filling.FillableArray;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public class Main {

    private static final FillableArray<Integer> FILLABLE_ARRAY
                                            = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Array<Integer> integerArray = new Array<>(FILLABLE_ARRAY.fillArray(new Integer[30]));

        System.out.println("Original array : ");
        Arrays.stream(integerArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        COMPRESSIBLE.compress(integerArray);

        System.out.println("Result array : ");
        Arrays.stream(integerArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
    }

    private static final Compressible<Integer> COMPRESSIBLE = array -> {
        int numberZeroElements = 0;
        List<Integer> list = new ArrayList<>(0);
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] != 0) {
                list.add(array.getArray()[i]);
            } else {
                numberZeroElements++;
            }
        }
        array.setArray(list.toArray(new Integer[list.size()]));
        System.out.printf("Number of zero elements in the array : %d .", numberZeroElements);
        System.out.println();
    };
}
