package com.lugowoy.tasks.printEvenAndOddNumbers;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.07.2017. */

public class Main {

    public static void main(String[] args) {

        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> array = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                new FillingArrayRandomIntegerNumbers().fill(lengthArray));

        System.out.println("Original numbers : " + array);
        System.out.println();

        printEvenNumber(array);
        System.out.println();
        printOddNumbers(array);

    }

    private static void printEvenNumber(Array<Integer> array) {
        System.out.println("Even numbers : ");
        Arrays.stream(array.toArray()).forEachOrdered(value -> {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        });

    }

    private static void printOddNumbers(Array<Integer> array) {
        System.out.println("Odd numbers : ");
        Arrays.stream(array.toArray()).forEachOrdered(value -> {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        });

    }

}
