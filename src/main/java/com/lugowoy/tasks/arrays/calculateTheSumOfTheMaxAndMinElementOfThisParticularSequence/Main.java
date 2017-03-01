package com.lugowoy.tasks.arrays.calculateTheSumOfTheMaxAndMinElementOfThisParticularSequence;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 01.03.2017. */

public class Main {

    private static final FillableArray<Integer> FILLABLE_ARRAY
                                                    = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Integer[] integers = FILLABLE_ARRAY.fillArray(new Integer[30]);

        System.out.println("Original : ");
        Arrays.stream(integers).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Findable<Integer> findable = Main::findMax;
        int maxElement = findable.find(integers);

        findable = Main::findMin;
        int minElement = findable.find(integers);

        System.out.println("Result summation : " + (maxElement + minElement));
    }

    private static int findMax(Integer[] integers) {
        int  result = 0;
        for (int i = 0; i < integers.length; i++) {
            if ((i > 1) && (i % 2 == 0)) {
                if (integers[i] > result) {
                    result = integers[i];
                }
            }
        }
        return result;
    }

    private static int findMin(Integer[] integers) {
        int result = 200;
        for (int i = 0; i < integers.length; i++) {
            if ((i == 1) || (i % 2 != 0)) {
                if (integers[i] < result) {
                    result = integers[i];
                }
            }
        }
        return result;
    }
}
