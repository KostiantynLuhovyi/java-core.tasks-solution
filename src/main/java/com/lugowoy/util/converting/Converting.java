package com.lugowoy.util.converting;

/**
 * Created by Konstantin on 29-Jan-17.
 * @author Konstantin
 * @version 1.0
 * @since 1.1
 *
 * Functional interface declares a function to perform the convert.
 */
@FunctionalInterface
public interface Converting<T> {

    /*Method to convert.*/
    void convert(T t);
}
