package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating;

import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 23.10.2017. */

public interface CalculatingPercentageOfZeroNumbers<T extends Number> extends CalculatingPercentage<T> {

    @Override
    default int calculatePercentageOfZeroNumbers(Array<T> array) {
        int amountOfZeroNumbers = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i].equals(0)) {
                amountOfZeroNumbers++;
            }
        }
        return CalculatingPercentage.calculatePercentage(amountOfZeroNumbers, array.getArray().length);
    }

}
