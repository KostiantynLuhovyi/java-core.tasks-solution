package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Changeable<T, V> {

    void change(T t, V firstArg, V secondArg);

    static void changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumberByRule(Sequence<Integer> sequence, Integer squareMinNumber, Integer squareMaxNumber) {
        for (int i = 0; i < sequence.getSequence().length; i++) {
            if (sequence.getSequence()[i] >= 0) {
                sequence.getSequence()[i] *= squareMinNumber;
            } else if (sequence.getSequence()[i] <= 0) {
                sequence.getSequence()[i] *= squareMaxNumber;
            }
        }
    }
}
