package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 27-Jan-17.
 */
public class ReadingRandomData implements ReadableRandomData {

    public int readInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    public int readInt() throws StoppingEnterValueException {
        return RANDOM.nextInt();
    }

    public double readDouble() throws StoppingEnterValueException {
        return RANDOM.nextDouble();
    }
}
