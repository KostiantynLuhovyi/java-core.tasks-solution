package com.lugowoy.tasks.arrays.toDetermineTheSequenceOfNumbersIsIncreasing;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers<Integer> numbers = new Numbers<>();

        numbers.setSequenceNumbers(FILLING_ARRAY.fillArray(new Integer[20]));

        System.out.println("Sequence : ");
        Arrays.stream(numbers.getSequenceNumbers()).forEachOrdered(integer -> System.out.print(integer + " "));

        boolean resultIncreasingSequence = false;
            if (numbers.getSequenceNumbers()[1] > numbers.getSequenceNumbers()[0]) {
                resultIncreasingSequence = true;
            }
        System.out.println();

        if (resultIncreasingSequence) System.out.println("The sequence of increasing.");
        else System.out.println("The sequence of a not increasing");
    }
}
