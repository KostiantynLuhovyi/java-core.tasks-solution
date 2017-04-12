package com.lugowoy.tasks.arrays.determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence;

/** Created by Konstantin Lugowoy on 12.04.2017. */

@FunctionalInterface
public interface Determinable<T> {

    boolean determine(T tFirst, T tSecond);

    static boolean determineWhetherTheElementsOfTheSecondSequenceInTheFirstSequence(Sequence<Integer> tFirst, Sequence<Integer> tSecond) {
        boolean result = true;
        label :
        for (int i : tFirst.getSequence()) {
            for (int j : tSecond.getSequence())
                if (i == j) continue label;
            result = false;
        }
        return result;
    }
}
