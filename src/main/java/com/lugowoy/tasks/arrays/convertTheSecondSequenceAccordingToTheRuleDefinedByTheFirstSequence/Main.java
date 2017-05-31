package com.lugowoy.tasks.arrays.convertTheSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    private static final Convertable<Integer> CONVERTABLE = Convertable::convertSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

    public static void main(String[] args) {

        Sequence<Integer> firstSequence = new Sequence<>(FILLABLE.fillArray(new Integer[20]));
        System.out.println("Original first sequence : ");
        Arrays.stream(firstSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Sequence<Integer> secondSequence = new Sequence<>(FILLABLE.fillArray(new Integer[20]));
        System.out.println("Original second sequence : ");
        Arrays.stream(secondSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        CONVERTABLE.convert(firstSequence, secondSequence);

        System.out.println("Result second sequence after converting : ");
        Arrays.stream(secondSequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }
}
