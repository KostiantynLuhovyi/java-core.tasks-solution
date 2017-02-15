package com.lugowoy.util.fillable;

/**
 * Created by Konstantin on 04-Dec-16.
 *
 * @author Konstantin
 * @version 1.1
 * @since 1.0
 * <p>
 * Interface "Fillable" declares the contract for the implementation of the functional filling of the array values.
 */

public interface Fillable<T> {

    /**
     * This method is called(realization) to fill an array of values.
     *
     * @param t Array data type parametrized on which (who) filled with the values.
     * @return Return filled array.
     * It is necessary to stop the input values when filling the array.
     * @since 1.1
     */
    T[] fillArray(T[] t);


}
