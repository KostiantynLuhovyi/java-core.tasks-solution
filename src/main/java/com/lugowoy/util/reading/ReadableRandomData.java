package com.lugowoy.util.reading;

import java.util.Random;

/**
 * Created by Konstantin on 11.11.2016.
 * @author Konstantin
 * @version 1.1
 * @since 1.0
 *
 * Interface "ReadableUserInputData" announces contract to generated random number and read result.
 * Inherits interface "ReadableData".
 *
 * @see com.lugowoy.util.reading.ReadableData
 */
public interface ReadableRandomData extends ReadableData {
    /**
    * Instance of the class Random, for generating random numbers.
    * */
    Random RANDOM = new Random();

    /*
    * Abstract method to generated and read random value type integer.
    * Argument "bound" indicates the upper limit: 0 ... bound.
    * */
    int readInt(int bound);
}
