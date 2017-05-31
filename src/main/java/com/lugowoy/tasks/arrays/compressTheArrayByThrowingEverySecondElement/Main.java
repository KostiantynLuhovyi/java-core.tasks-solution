package com.lugowoy.tasks.arrays.compressTheArrayByThrowingEverySecondElement;

import com.lugowoy.util.filling.FillableArray;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 13.03.2017. */

public class Main {

    private static final FillableArray<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Integer[] integers = FILLABLE.fillArray(new Integer[17]);

        Array<Integer> integerArray = new Array<>(integers);

        System.out.println("Original array : ");
        Arrays.stream(integerArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        ARRAY_COMPRESSIBLE.compress(integerArray);

        System.out.println("Result array : ");
        Arrays.stream(integerArray.getArray()).filter(Objects::nonNull).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }

    private static final Compressible<Array> ARRAY_COMPRESSIBLE = array -> {
        if (array != null) {
            List<Object> integerList = new ArrayList<>(0);
            for (int i = 0; i < array.getArray().length; i++) {
                if (i % 2 != 0) {
                    integerList.add(array.getArray()[i]);
                }
            }
            array.setArray(integerList.toArray(new Object[integerList.size()]));
        }
    };

}
