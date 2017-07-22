package com.lugowoy.util.reading;

import java.util.Random;

/**
 * Created by Konstantin Lugowoy on 11.11.2016.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.0
 * <p>
 * This interface is the inheritor to the interface ReadableData.
 * @see com.lugowoy.util.reading.Readable
 * @see com.lugowoy.util.reading.ReadableData
 * This extends the functionality of the contract declared by the interface ReadableData.
 * The implementation of this interface is designed to read the generated data pseudo-randomly, namely integer and real values.
 * </p>
 */
interface ReadableRandomData extends ReadableData {

    /**
     * <p>
     * Static context attribute generating pseudo-random integer and real values.
     * @see java.util.Random
     * </p>
     * */
    Random RANDOM = new Random();

    /**
     * <p>
     * A method that reads a concrete data of an integer type in the range from 0 to bound, inclusive.
     * </p>
     * @param bound - The maximum value up to which will be made the generation of pseudo-random numbers.
     * @return The concrete value of the generated integer type.
     * @since 1.0
     * */
    int readInt(int bound);

}
