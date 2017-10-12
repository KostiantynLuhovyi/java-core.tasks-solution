package com.lugowoy.tasks.printEvenAndOddNumbers;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.DeterminatorSizeOfArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Integer> array = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels()).create(new FillingArrayIntegerRandomNumbers().fill(sizeArray));

        System.out.println("Original numbers :");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        printEvenNumber(array);
        System.out.println();
        printOddNumbers(array);

    }

    private static void printEvenNumber(Array<Integer> array) {
        System.out.println("Even numbers : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> {
            if (value % 2 == 0) {
                System.out.print(value + " ");
            }
        });

    }

    private static void printOddNumbers(Array<Integer> array) {
        System.out.println("Odd numbers : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        });

    }

}
