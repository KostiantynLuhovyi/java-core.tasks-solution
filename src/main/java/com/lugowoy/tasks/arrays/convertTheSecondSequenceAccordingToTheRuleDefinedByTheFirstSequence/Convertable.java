package com.lugowoy.tasks.arrays.convertTheSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Convertable<T> {

    void convert(Sequence<T> firstSequence, Sequence<T> secondSequence);
    
    static void convertSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence(Sequence<Integer> firstSequence, Sequence<Integer> secondSequence) {
        if (firstSequence.getSequence().length == secondSequence.getSequence().length) {
            for (int i = 0; i < firstSequence.getSequence().length; i++) {
                if (firstSequence.getSequence()[i] <= 0) {
                    secondSequence.getSequence()[i] *= 10;
                } else {
                    secondSequence.getSequence()[i] = 0;
                }
            }
        } else {
            System.out.println("Sequence sizes are not equal.");
        }
    }
}
