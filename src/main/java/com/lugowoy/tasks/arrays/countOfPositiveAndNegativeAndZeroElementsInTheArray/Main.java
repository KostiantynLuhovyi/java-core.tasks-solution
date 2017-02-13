package com.lugowoy.tasks.arrays.countOfPositiveAndNegativeAndZeroElementsInTheArray;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Numbers numbers = new Numbers(Arrays.stream(new Integer[20]).mapToInt(value -> RANDOM.nextInt(200) - 100).toArray());

        System.out.println("Numbers : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));

        System.out.println();

        Counting counting = Counting::countNegativeNumber;
        System.out.println("Negative number : " + counting.count(numbers));

        counting = Counting::countZero;
        System.out.println("Zero : " + counting.count(numbers));

        counting = Counting::countPositiveNumber;
        System.out.println("Positive number : " + counting.count(numbers));
    }
}
