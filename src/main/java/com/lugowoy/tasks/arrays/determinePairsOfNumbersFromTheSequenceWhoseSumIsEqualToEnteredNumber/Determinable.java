package com.lugowoy.tasks.arrays.determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public interface Determinable<T> {

    void determine(Sequence<T> sequence, int numberForEqual);

    static void determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber(Sequence<Integer> sequence, int numberForEqual) {
        int countResult = 0;
        for (int i = 0; i < sequence.getSequence().length; i++) {
            for (int j = 0; j < sequence.getSequence().length; j++) {
                if ((sequence.getSequence()[i] + sequence.getSequence()[j]) == numberForEqual) {
                    System.out.printf("Element %d , with index %d a plus, element %d, with index %d is equal %d",
                            sequence.getSequence()[i], i, sequence.getSequence()[j], j, numberForEqual);
                    countResult++;
                    System.out.println();
                }
            }
        }
        if (countResult == 0) System.out.println("Not found numbers in a sequence whose sum is equal to the entered number.");
    }
}
