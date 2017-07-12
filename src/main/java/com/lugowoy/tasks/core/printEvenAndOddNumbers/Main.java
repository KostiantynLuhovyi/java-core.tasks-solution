package com.lugowoy.tasks.core.printEvenAndOddNumbers;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.07.2017. */

public class Main {

    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creatorArray.create(new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt).fillArray(new int[sizeArray]));

        System.out.println("Original numbers :");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        printEvenNumber(array);
        System.out.println();
        printOddNumbers(array);

    }

    private static void printEvenNumber(Array<Integer> array) {
        System.out.println("Even numbers : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        });

    }

    private static void printOddNumbers(Array<Integer> array) {
        System.out.println("Odd numbers : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        });

    }

}
