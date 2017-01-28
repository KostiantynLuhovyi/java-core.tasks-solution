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

    /**
     * This method for readout.
     *
     * @since 1.1
     * @return Parameterized type initialized with the classified functional interface object.
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * */
    T reading() throws StoppingEnterValueException;
}
