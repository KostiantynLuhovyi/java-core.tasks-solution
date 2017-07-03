package com.lugowoy.tasks.arrays.onedimensional.createNewArrayFromTheUniqueElementsOfTheOriginalArray;

/** Created by Konstantin Lugowoy on 29.05.2017. */

public abstract class Creator<V, T extends Number> {

    private DeterminableUniqueness<V, T> determinableUniqueness;

    public Creator(DeterminableUniqueness<V, T> determinableUniqueness) {
        this.determinableUniqueness = determinableUniqueness;
    }

    abstract V create(V v);

    public DeterminableUniqueness<V, T> getDeterminableUniqueness() {
        return determinableUniqueness;
    }

}
