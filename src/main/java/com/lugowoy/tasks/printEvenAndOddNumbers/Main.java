package com.lugowoy.tasks.printEvenAndOddNumbers;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

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
        for (int i = 0; i < array.getLength(); i++) {
            if (array.get(i) % 2 == 0) {
                System.out.print(array.get(i) + " ");
            }
        }
    }

    private static void printOddNumbers(Array<Integer> array) {
        System.out.println("Odd numbers : ");
        for (int i = 0; i < array.getLength(); i++) {
            if (array.get(i) % 2 != 0) {
                System.out.print(array.get(i) + " ");
            }
        }
    }

}
