package com.lugowoy.util.reading;

/**
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 * <p>
 * Functional interface "Reading" provides the functionality to implement read input data.
 */
@FunctionalInterface
public interface Reading<T> {

    /**
     * This method for readout.
     *
     * @return Parametrized type initialized with the classified functional interface object.
     * @since 1.1
     */
    T reading();

}
