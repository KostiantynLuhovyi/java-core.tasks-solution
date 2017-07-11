package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 26-Jan-17.
 *
 * @author Konstantin
 * @version 1.1
 * @see com.lugowoy.util.reading.Readable
 * @since 1.1
 * <p>
 * "ReadableData" interface is the inheritor "Readable" interface and declares the contract (abstract method)
 * to implement the functionality of reading the user input and random number generation.
 */
interface ReadableData extends Readable {

    /*
    * Abstract method reads the integer value type, depending on the particular implementation.
    * */
    int readInt();

    /*
    * Abstract method reads the double value type, depending on the particular implementation.
    * */
    double readDouble() throws StoppingEnterValueException;
}
