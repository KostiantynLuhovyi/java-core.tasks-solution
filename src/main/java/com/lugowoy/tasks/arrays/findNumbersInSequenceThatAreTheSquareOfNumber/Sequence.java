package com.lugowoy.tasks.arrays.findNumbersInSequenceThatAreTheSquareOfNumber;

/** Created by Konstantin Lugowoy on 12.03.2017. */

public class Sequence<T> {

    T[] tSequence;

    public Sequence() {
    }

    public Sequence(T[] tSequence) {
        this.tSequence = tSequence;
    }

    public T[] gettSequence() {
        return tSequence;
    }

    public void settSequence(T[] tSequence) {
        this.tSequence = tSequence;
    }
}

