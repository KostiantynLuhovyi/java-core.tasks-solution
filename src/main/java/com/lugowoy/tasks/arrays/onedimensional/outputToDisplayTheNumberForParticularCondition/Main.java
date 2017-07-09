package com.lugowoy.tasks.arrays.onedimensional.outputToDisplayTheNumberForParticularCondition;

import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/**Created by Konstantin Lugowoy on 14-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers numbers = new Numbers(Arrays.stream(FILLING_ARRAY.fillArray(new Integer[20])).mapToInt(Integer::intValue).toArray());

        System.out.println("Original array : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));

        System.out.println();

        System.out.println("Result : ");
        DISPLAYABLE.displaying(numbers);
    }

    private static final Displayable DISPLAYABLE = numbers -> {
        int firstValue = numbers.getNumbers()[0];
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            if (firstValue <= numbers.getNumbers()[i]) {
                System.out.print(numbers.getNumbers()[i] + " ");
            }
        }
    };
}
