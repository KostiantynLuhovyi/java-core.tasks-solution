package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.models.arrays.ArrayOfDoubleNumbers;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfDoubleArrayModels extends FactoryOfArrayModels<Double> {

    @Override
    public Array<Double> create() {
        return ArrayOfDoubleNumbers.getInstanceArrayOfDoubleNumbers();
    }

    @Override
    public Array<Double> create(Double[] array) {
        return ArrayOfDoubleNumbers.getInstanceArrayOfDoubleNumbers(array);
    }

    @Override
    public Array<Double> create(int lengthArray) {
        Array<Double> array = ArrayOfDoubleNumbers.getInstanceArrayOfDoubleNumbers(new Double[lengthArray]);
        array.setArray(lengthArray);
        return array;
    }

}
