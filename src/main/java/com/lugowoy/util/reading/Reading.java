package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy 11.11.2016.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.1
 * <p>
 * Provides functionality for reading data.
 * </p>
 * @param <T> - Type of read data.
 */
@FunctionalInterface
public interface Reading<T> {

    /**
     * <p>
     * The method (function) provides all possible implementation of reading concrete data.
     * </p>
     * @return Read data of a concrete type.
     * @since 1.0
     * */
    T reading();

}
