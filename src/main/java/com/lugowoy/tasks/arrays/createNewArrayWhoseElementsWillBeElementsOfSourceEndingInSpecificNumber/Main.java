package com.lugowoy.tasks.arrays.createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber;

import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Array array = new Array(Arrays.stream(new int[30]).map(operand -> RANDOM.nextInt(Integer.MAX_VALUE)).toArray());

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Enter specific ending number : ");
        ReadingUserInputData readingUserInputData = new ReadingUserInputData();
        int specificEndingNumber = readingUserInputData.readInt();

        Array newArray = createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber(array, specificEndingNumber);

        System.out.println("New array : ");
        Arrays.stream(newArray.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

    }

    private static Array createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber(Array array, int specificEndingNumber) {
        List<Integer> resultNewIntegerList = new ArrayList<>(0);

        if (array != null) {
            if ((array.getArray() != null) && (array.getArray().length > 0)) {
                for (int i : array.getArray()) {
                    if (Math.abs(i) % 10 == specificEndingNumber) {
                        resultNewIntegerList.add(i);
                    }
                }
            } else {
                System.out.println("Incorrect argument passed.");
            }
        } else {
            System.out.println("Incorrect argument passed.");
        }

        return new Array(resultNewIntegerList.stream().mapToInt(Integer::intValue).toArray());
    }

}
