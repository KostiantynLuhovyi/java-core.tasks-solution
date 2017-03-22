package com.lugowoy.tasks.arrays.determineTheMostRepeatedElementInAnArray;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 22.03.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Array<Integer> array =
                new Array<>(Arrays.stream(new int[30]).map(operand -> RANDOM.nextInt(20)).boxed().toArray(Integer[]::new));

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        determineTheMostRepeatedElementsInAnArray.determine(array);

    }

    private static Determinable<Integer> determineTheMostRepeatedElementsInAnArray = array -> {
      int count, countMax = 0, value = 1, num = 0;

        for (int i = 0; i < array.getArray().length; i++) {
            count = 1;
            for (int j = i + 1; j < array.getArray().length; j++) {
                if (array.getArray()[i].equals(array.getArray()[j])) {
                    value = array.getArray()[j];
                    count++;
                } else if (count > countMax) {
                    countMax = count;
                    if (value <= array.getArray()[i]) {
                        num = i;
                    }
                }
            }
        }
        System.out.println("Element " + array.getArray()[num] + ", repeated " + countMax);
    };
}
