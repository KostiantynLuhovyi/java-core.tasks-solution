package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating;

import com.lugowoy.helper.models.arrays.Array;

import static com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating.CalculatingPercentage.calculatePercentage;
import static java.lang.Math.*;

/** Created by Konstantin Lugowoy on 23.10.2017. */

public interface CalculatingPercentageOfOddNumbers<T extends Number> extends CalculatingPercentage<T> {

    @Override
    default int calculatePercentageOfOddNumbers(Array<T> array) {
        int amountOfOddNumbers = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            double value = array.getArray()[i].doubleValue();
            if (abs(value) % 2 != 0) {
                amountOfOddNumbers++;
            }
        }
        return calculatePercentage(amountOfOddNumbers, array.getArray().length);
    }

}
