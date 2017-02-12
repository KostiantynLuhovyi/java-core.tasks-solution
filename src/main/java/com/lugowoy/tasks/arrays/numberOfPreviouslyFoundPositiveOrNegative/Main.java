package com.lugowoy.tasks.arrays.numberOfPreviouslyFoundPositiveOrNegative;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        SequenceOfIntegers sequence = new SequenceOfIntegers();
        sequence.setSequenceOfIntegers(Arrays.stream(new int[20]).map(operand -> RANDOM.nextInt(200) - 100).toArray());

        System.out.println("The sequence of integers to determine a sign of the number is the first in the sequence : ");
        Arrays.stream(sequence.getSequenceOfIntegers()).forEach(value -> System.out.print(value + " "));

        System.out.println();

        int firstElementInRheSequence = Arrays.stream(sequence.getSequenceOfIntegers()).findFirst().orElse(0);

        if (firstElementInRheSequence > 0) {
            System.out.println("The first element of the sequence positive.");
        } else if (firstElementInRheSequence < 0) {
            System.out.println("The first element of the sequence negative.");
        } else {
            System.out.println("The first element of the sequence is equal : 0.");
        }
    }
}
