package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 27-Jan-17.
 */

public class ReadingData<T> {

    private Reading<T> reading;

    public ReadingData(Reading<T> reading) {
        this.reading = reading;
    }

    public T read() throws StoppingEnterValueException {
        return this.reading.reading();
    }

    public Reading<T> getReading() {
        return reading;
    }
}
