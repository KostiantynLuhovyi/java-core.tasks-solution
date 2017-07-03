package com.lugowoy.tasks.arrays.onedimensional.outputNumbersForWhichTheSumOfTheFirstTwoDigitsIsEqualToTheSumOfTheLastTwo;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 29.05.2017. */

public class Main {

    private static final Random RANDOM_FOURTH_DIGIT_NUMBER = new Random();

    public static void main(String[] args) {

        Array array = new Array(Arrays.stream(new Integer[30])
                                      .mapToInt(value -> value = (1000 + RANDOM_FOURTH_DIGIT_NUMBER.nextInt(10000)))
                                      .toArray());

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Result numbers for which the sum of the first two digits is equal to the sum of the last two : ");
        Determinable determinable = Determinable::determineNumbersForWhichTheSumOfTheFirstTwoDigitsIsEqualToTheSumOfTheLastTwo;
        Arrays.stream(array.getArray()).forEachOrdered(value -> {
            if (determinable.determine(value)) {
                System.out.print(value + " ");
            }
        });

    }

}
