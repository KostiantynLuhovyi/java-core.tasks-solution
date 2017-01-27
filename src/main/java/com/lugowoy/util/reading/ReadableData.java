package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 26-Jan-17.
 */

public interface ReadableData extends Readable {

    int readInt() throws StoppingEnterValueException;

    double readDouble() throws StoppingEnterValueException;
}
