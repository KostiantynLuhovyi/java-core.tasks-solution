package com.lugowoy.tasks.printMaxAndMinNumber;

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

        System.out.println("Original number : " + array);
        System.out.println();

        int indexMaxElement = getIndexMaxNumber(array);
        int indexMinElement = getIndexMinNumber(array);

        System.out.println("Max element : " + array.get(indexMaxElement));
        System.out.println("Min element : " + array.get(indexMinElement));

    }

    private static int getIndexMaxNumber(Array<Integer> array) {
        int value = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.get(i) > value) {
                value = array.get(i);
                index = i;
            }
        }
        return index;
    }

    private static int getIndexMinNumber(Array<Integer> array) {
        int value = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.get(i) < value) {
                value = array.get(i);
                index = i;
            }
        }
        return index;
    }

}
