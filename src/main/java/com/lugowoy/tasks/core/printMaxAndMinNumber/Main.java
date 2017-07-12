package com.lugowoy.tasks.core.printMaxAndMinNumber;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = new CreatorArrayOfIntegerPrimitives().create(new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt).fillArray(new int[sizeArray]));

        System.out.println("Original number : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        int indexMaxElement = getIndexMaxNumber(array);
        int indexMinElement = getIndexMinNumber(array);

        System.out.println("Max element : " + array.getArrayOfIntegerPrimitives()[indexMaxElement]);
        System.out.println("Min element : " + array.getArrayOfIntegerPrimitives()[indexMinElement]);

    }

    private static int getIndexMaxNumber(Array<Integer> array) {
        int value = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
            if (array.getArrayOfIntegerPrimitives()[i] > value) {
                value = array.getArrayOfIntegerPrimitives()[i];
                index = i;
            }
        }
        return index;

    }

    private static int getIndexMinNumber(Array<Integer> array) {
        int value = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
            if (array.getArrayOfIntegerPrimitives()[i] < value) {
                value = array.getArrayOfIntegerPrimitives()[i];
                index = i;
            }
        }
        return index;

    }

}
