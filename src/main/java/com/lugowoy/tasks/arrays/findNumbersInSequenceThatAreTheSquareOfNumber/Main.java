package com.lugowoy.tasks.arrays.findNumbersInSequenceThatAreTheSquareOfNumber;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 12.03.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Sequence<Integer> sequence = new Sequence<>();
        sequence.settSequence(Arrays.stream(new Integer[20])
                                    .mapToInt(value -> value = RANDOM.nextInt(50))
                                    .boxed().toArray(Integer[]::new));

        System.out.println("Original sequence : ");
        Arrays.stream(sequence.gettSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Enter a number to compare : ");
        Reading<Integer> reading = new ReadingUserInputData()::readInt;
        int compareNumber = reading.reading();

        System.out.println("Result : ");
        int quantityResult = 0;
        for (int i = 0; i < sequence.gettSequence().length; i++) {
            int number = sequence.gettSequence()[i];
            int squareRootNumber = (int)Math.pow(number, 2);
            if (compareNumber == squareRootNumber) {
                System.out.printf("Sequence index : %d, element : %d", i,number);
                quantityResult++;
            }
        }

        if (quantityResult == 0) {
            System.out.println("There are no numbers in the sequence satisfying condition.");
        }

    }
}
