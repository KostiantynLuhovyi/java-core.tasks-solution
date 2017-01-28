package com.lugowoy.util.fillable;

import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 04-Dec-16.
 * @author Konstantin
 * @version 1.1
 * @since 1.0
 *
 * Interface "Fillable" declares the contract for the implementation of the functional filling of the array values.
 */
public interface Fillable<T> {

    /**
     * This method is called(realization) to fill an array of values.
     *
     * @since 1.1
     * @param t Array data type parameterized on which (who) filled with the values.
     * @return Return filled array.
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * It is necessary to stop the input values when filling the array.
     * */
    T[] fillArray(T[] t) throws StoppingEnterValueException;
}
