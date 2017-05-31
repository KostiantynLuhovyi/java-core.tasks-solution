package com.lugowoy.util.filling;

import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 28-Jan-17.
 *
 * @author Konstantin
 * @version 1.1
 * @see com.lugowoy.util.filling.Fillable
 * @since 1.1
 * <p>
 * The class implements the functionality (interface "Fillable") to fill an array of values.
 */
public abstract class FillableArray<T> implements Fillable<T> {

    /**
     * This field encapsulating functional interface for reading the values entered by the user to be filled with an array.
     */
    private Reading<T> reading;

    FillableArray(Reading<T> reading) {
        this.reading = reading;
    }

    @Override
    public abstract T[] fillArray(T[] t);

    public Reading<T> getReading() {
        return reading;
    }
}
