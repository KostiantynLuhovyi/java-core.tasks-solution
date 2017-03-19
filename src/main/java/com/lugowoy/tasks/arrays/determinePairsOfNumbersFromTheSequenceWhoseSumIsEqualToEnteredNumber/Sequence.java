package com.lugowoy.tasks.arrays.determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public class Sequence<T> {

    T[] sequence;

    public Sequence() {
    }

    public Sequence(T[] sequence) {
        this.sequence = sequence;
    }

    public T[] getSequence() {
        return sequence;
    }

    public void setSequence(T[] sequence) {
        this.sequence = sequence;
    }
}
