package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.models.arrays.ArrayOfIntegerNumbers;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfIntegerArrayModels extends FactoryOfArrayModels<Integer> {

    @Override
    public Array<Integer> create() {
        return ArrayOfIntegerNumbers.getInstanceArrayOfIntegerNumbers();
    }

    @Override
    public Array<Integer> create(Integer[] array) {
        return ArrayOfIntegerNumbers.getInstanceArrayOfIntegerNumbers(array);
    }

    @Override
    public Array<Integer> create(int lengthArray) {
        Array<Integer> array = ArrayOfIntegerNumbers.getInstanceArrayOfIntegerNumbers(new Integer[lengthArray]);
        array.setArray(lengthArray);
        return array;
    }

}
