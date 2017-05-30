package com.lugowoy.tasks.arrays.determineTheNumberOfElementsThatAreIdenticalInTwoSequences;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 30.05.2017. */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Sequence<Integer> firstSequence = new Sequence<>(Arrays.stream(new Integer[30])
                                                               .mapToInt(value -> value = READING_DATA.read())
                                                               .boxed()
                                                               .toArray(Integer[]::new));

        Sequence<Integer> secondSequence = new Sequence<>(Arrays.stream(new Integer[30])
                                                                .mapToInt(value -> value = READING_DATA.read())
                                                                .boxed()
                                                                .toArray(Integer[]::new));

        System.out.println("Elements of the first sequence : ");
        Arrays.stream(firstSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Elements of the second sequence : ");
        Arrays.stream(secondSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Determinable<Sequence<Integer>> determinable = Determinable::determineTheNumberOfElementsThatAreIdenticalInTwoSequences;
        int numberOfIdenticalElementsInTheTwoSequence = determinable.determine(firstSequence, secondSequence);
        System.out.println("Number of identical elements in the two sequence : " + numberOfIdenticalElementsInTheTwoSequence);

    }

}
