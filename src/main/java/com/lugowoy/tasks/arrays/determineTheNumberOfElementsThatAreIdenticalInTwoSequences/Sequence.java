package com.lugowoy.tasks.arrays.determineTheNumberOfElementsThatAreIdenticalInTwoSequences;

/** Created by Konstantin Lugowoy on 30.05.2017. */

public class Sequence<T> {

    private T[] sequence;

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
