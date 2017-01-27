package com.lugowoy.util.reading;

/**
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 *
 *  Functional interface "Reading" provides the functionality to implement read input data.
 */

@FunctionalInterface
public interface Reading<T> {

    T reading() throws StoppingEnterValueException;
}
