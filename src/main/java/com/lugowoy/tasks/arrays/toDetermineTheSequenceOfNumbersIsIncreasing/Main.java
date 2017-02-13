package com.lugowoy.tasks.arrays.toDetermineTheSequenceOfNumbersIsIncreasing;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Numbers<Integer> numbers = new Numbers<>();

        numbers.setSequenceNumbers(Arrays
                                        .stream(new Integer[10])
                                        .mapToInt(value -> RANDOM.nextInt(20))
                                        .boxed()
                                        .toArray(Integer[]::new));

        Arrays.stream(numbers.getSequenceNumbers()).forEachOrdered(integer -> System.out.print(integer + " "));

        boolean resultIncreasingSequence = false;
        for (int i = 2; i < numbers.getSequenceNumbers().length; i++) {
            if (numbers.getSequenceNumbers()[i] > numbers.getSequenceNumbers()[i - 1]) {
                resultIncreasingSequence = true;
            }
        }

        System.out.println();

        if (resultIncreasingSequence) System.out.println("The sequence of increasing.");
        else System.out.println("The sequence of a not increasing");
    }
}
