package com.lugowoy.util.converting;

/**
 * Created by Konstantin on 29-Jan-17.
 * @author Konstantin
 * @version 1.0
 * @since 1.1
 *
 * Interface "Convertable" declares the contract for the implementation of the conversion.
 *
 */
public interface Convertable<T> {

    /**
     * Method "convert(T t)" called for the conversion of values that encapsulates the variable passed to the parameter t.
     * */
    void convert(T t);
}
