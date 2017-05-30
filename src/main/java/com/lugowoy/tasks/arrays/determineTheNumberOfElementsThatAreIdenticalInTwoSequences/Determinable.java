package com.lugowoy.tasks.arrays.determineTheNumberOfElementsThatAreIdenticalInTwoSequences;

/** Created by Konstantin Lugowoy on 30.05.2017. */

@FunctionalInterface
public interface Determinable<T> {

    int determine(T firstT, T secondT);

    static int determineTheNumberOfElementsThatAreIdenticalInTwoSequences(Sequence<Integer> firstSequence, Sequence<Integer> secondSequence) {
        int resultNumberOfIdenticalElements = 0;

        for (int i = 0; i < firstSequence.getSequence().length; i++) {
            for (int j = 0; j < secondSequence.getSequence().length; j++) {
                if (firstSequence.getSequence()[i].intValue() == secondSequence.getSequence()[j].intValue()) {
                    resultNumberOfIdenticalElements++;
                }
            }
        }

        return resultNumberOfIdenticalElements;
    }
}
