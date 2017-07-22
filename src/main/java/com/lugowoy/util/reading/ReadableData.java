package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy on 26-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.1
 * <p>
 * This interface is the inheritor to the marker-interface Readable.
 * @see com.lugowoy.util.reading.Readable
 * The interface declares a contract to read concrete data.
 * Abstract methods declared in the interface are designed to work with numbers,
 * for the reason that data of these types are the most common with further expansion and implementation of the functionality.
 * </p>
 */
interface ReadableData extends Readable {

    /**
     * <p>
     * A method that reads concrete data of an integer type.
     * </p>
     * @return The concrete value of the integer type.
     * @since 1.0
     * */
    int readInt();

    /**
     * <p>
     * A method that reads concrete data of a real double type.
     * </p>
     * @return The concrete value of the real double type.
     * @since 1.0
     * */
    double readDouble();

}
