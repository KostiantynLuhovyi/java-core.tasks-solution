package com.lugowoy.tasks.arrays.determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public class Main {

    private static final Determinable<Integer> DETERMINABLE = Determinable::determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

    public static void main(String[] args) {

        Integer[] integers = Arrays.stream(new int[50]).map(operand -> (int)((Math.random() * 100))).boxed().toArray(Integer[]::new);

        Sequence<Integer> integerSequence = new Sequence<>(integers);

        Arrays.stream(integerSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        int sumNumber = enterNumber();

        DETERMINABLE.determine(integerSequence, sumNumber);

    }

    private static int enterNumber() {
        Reading<Integer> reading = new ReadingUserInputData()::readInt;

        System.out.println("Enter number : ");

        return reading.reading();
    }
}
