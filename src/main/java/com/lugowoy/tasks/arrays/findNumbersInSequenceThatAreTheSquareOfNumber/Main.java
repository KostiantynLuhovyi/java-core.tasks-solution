package com.lugowoy.tasks.arrays.findNumbersInSequenceThatAreTheSquareOfNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 12.03.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Sequence<Integer> sequence = new Sequence<>();
        sequence.setSequence(Arrays.stream(new Integer[20])
                                    .mapToInt(value -> value = RANDOM.nextInt(50))
                                    .boxed().toArray(Integer[]::new));

        System.out.println("Original sequence : ");
        Arrays.stream(sequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Enter a number to compare : ");
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        int compareNumber = reading.read();

        System.out.println("Result : ");
        int quantityResult = 0;
        for (int i = 0; i < sequence.getSequence().length; i++) {
            int number = sequence.getSequence()[i];
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
