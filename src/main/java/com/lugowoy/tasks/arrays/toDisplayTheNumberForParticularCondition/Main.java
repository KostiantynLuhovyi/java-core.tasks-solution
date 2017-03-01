package com.lugowoy.tasks.arrays.toDisplayTheNumberForParticularCondition;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 14-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    private static final Displayable DISPLAYABLE = numbers -> {
        int firstValue = numbers.getNumbers()[0];
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            if (firstValue <= numbers.getNumbers()[i]) {
                System.out.print(numbers.getNumbers()[i] + " ");
            }
        }
    };

    public static void main(String[] args) {

        Numbers numbers = new Numbers(Arrays.stream(FILLING_ARRAY.fillArray(new Integer[20])).mapToInt(Integer::intValue).toArray());

        System.out.println("Original array : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));

        System.out.println();

        System.out.println("Result : ");
        DISPLAYABLE.displaying(numbers);
    }
}