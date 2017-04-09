package com.lugowoy.util.fillable;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**Created by Konstantin Lugowoy on 15-Feb-17.*/

public class FillingArrayOfRandomNumber<T> extends FillableArray<T> {

    public FillingArrayOfRandomNumber(Reading<T> reading) {
        super(reading);
    }

    @Override
    public T[] fillArray(T[] tArray) {
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = super.getReading().reading();
        }
        return tArray;
    }

}
