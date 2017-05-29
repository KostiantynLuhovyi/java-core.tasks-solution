package com.lugowoy.tasks.arrays.createNewArrayFromTheUniqueElementsOfTheOriginalArray;

import java.util.ArrayList;

/** Created by Konstantin Lugowoy on 29.05.2017. */

public class CreatorArray<T extends Number> extends Creator<Array<T>, T> {

    public CreatorArray(DeterminableUniqueness<Array<T>, T> determinableUniqueness) {
        super(determinableUniqueness);
    }

    @SuppressWarnings("unchecked")
    @Override
    Array<T> create(Array<T> array) {
        ArrayList<T> tmpResultArrayList = new ArrayList<>();
        for (int i = 0; i < array.getArray().length; i++) {
            if (this.getDeterminableUniqueness().determineUniqueness(array, array.getArray()[i])) {
                tmpResultArrayList.add(array.getArray()[i]);
            }
        }

        return new Array<>((T[])tmpResultArrayList.toArray(new Number[tmpResultArrayList.size()]));
    }

    @Override
    public DeterminableUniqueness<Array<T>, T> getDeterminableUniqueness() {
        return super.getDeterminableUniqueness();
    }
}
