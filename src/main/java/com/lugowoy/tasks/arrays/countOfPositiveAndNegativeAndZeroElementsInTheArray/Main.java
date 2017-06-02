package com.lugowoy.tasks.arrays.countOfPositiveAndNegativeAndZeroElementsInTheArray;

import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Integer[] integers = FILLING_ARRAY.fillArray(new Integer[20]);

        Numbers numbers = new Numbers(Arrays.stream(integers).mapToInt(Integer::intValue).toArray());

        System.out.println("Numbers : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));

        System.out.println();

        Counting counting = Counting::countNegativeNumber;
        System.out.println("Negative number : " + counting.count(numbers));

        counting = Counting::countZero;
        System.out.println("Zero : " + counting.count(numbers));

        counting = Counting::countPositiveNumber;
        System.out.println("Positive number : " + counting.count(numbers));
    }
}
