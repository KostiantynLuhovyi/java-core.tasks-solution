package com.lugowoy.tasks.arrays.interchangeTheElementsStandingOnOddAndEvenPositionsInTheArray;

import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 22-Feb-17. */

public class Main {

    private static final FillableArray<Integer> INTEGER_FILLABLE_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.setNumbers(Arrays.stream(INTEGER_FILLABLE_ARRAY.fillArray(new Integer[20])).mapToInt(Integer::intValue).toArray());

        System.out.println("Original array : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        INTERCHANGEABLE.interchange(numbers);

        System.out.println("ArrayOfObjects after exchange of places of elements of even and odd positions : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));
    }

    private static final Interchangeable INTERCHANGEABLE = numbers -> {
        for (int i = 1; i < numbers.getNumbers().length; i++) {
            if (i % 2 == 0) {
                int tmp = numbers.getNumbers()[i];
                numbers.getNumbers()[i] = numbers.getNumbers()[i + 1];
                numbers.getNumbers()[i + 1] = tmp;
            }
        }
    };
}
