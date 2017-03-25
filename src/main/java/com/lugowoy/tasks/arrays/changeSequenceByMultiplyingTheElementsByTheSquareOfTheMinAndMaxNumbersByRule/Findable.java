package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public interface Findable<T> {

    T find(Sequence<T> sequence);

    static Integer findMinNumber(Sequence<Integer> sequence) {
        int valueForDetermineMinNumber = Integer.MAX_VALUE;
        int indexMinNumber = 0, resultFindMinNumber;

        for (int i = 0; i < sequence.getSequence().length; i++) {
            if (sequence.getSequence()[i] <= valueForDetermineMinNumber) {
                valueForDetermineMinNumber = sequence.getSequence()[i];
                indexMinNumber = i;
            }
        }
        resultFindMinNumber = sequence.getSequence()[indexMinNumber];

        return resultFindMinNumber;
    }

    static Integer findMaxNumber(Sequence<Integer> sequence) {
        int valueForDetermineMaxNumber = Integer.MIN_VALUE;
        int indexMaxNumber = 0, resultFindMaxNumber;

        for (int i = 0; i < sequence.getSequence().length; i++) {
            if (sequence.getSequence()[i] >= valueForDetermineMaxNumber) {
                valueForDetermineMaxNumber = sequence.getSequence()[i];
                indexMaxNumber = i;
            }
        }
        resultFindMaxNumber = sequence.getSequence()[indexMaxNumber];

        return resultFindMaxNumber;
    }
}
