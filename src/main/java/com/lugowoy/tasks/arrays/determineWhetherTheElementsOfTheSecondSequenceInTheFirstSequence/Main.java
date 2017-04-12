package com.lugowoy.tasks.arrays.determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 12.04.2017. */

public class Main {

    public static void main(String[] args) {

        Sequence<Integer> sequenceFirst = new Sequence<>(Arrays.stream(new int[20])
                                                               .map(operand -> new Random().nextInt(50))
                                                               .boxed()
                                                               .toArray(Integer[]::new));

        Sequence<Integer> sequenceSecond = new Sequence<>(Arrays.stream(new int[3])
                                                                .map(operand -> new Random().nextInt(50))
                                                                .boxed()
                                                                .toArray(Integer[]::new));

        System.out.println("First sequence : ");
        Arrays.stream(sequenceFirst.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Second sequence : ");
        Arrays.stream(sequenceSecond.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Determinable<Sequence> determinable = Determinable::determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence;
        boolean resultDetermine = determinable.determine(sequenceFirst, sequenceSecond);

        if (resultDetermine) {
            System.out.println("Elements of the second sequence are included in the first sequence.");
        } else {
            System.out.println("Elements of the second sequence are not included in the first sequence.");
        }

    }
}
