package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 27-Jan-17.
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 *
 * This class encapsulates a decision on how to take the implementation of the data reading.
 */
public class ReadingData<T> {

    /**Functional interface to implements specify functional*/
    private Reading<T> reading;

    /**
     * Initialize field {@link ReadingData#reading}
     * @see com.lugowoy.util.reading.ReadingData
     * */
    public ReadingData(Reading<T> reading) {
        this.reading = reading;
    }

    /**
     * This method delegation realization functional to functional interface "Reading".
     *
     * @since 1.1
     * @return Parameterize type initialized with the classified functional interface object.
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * */
    public T read() throws StoppingEnterValueException {
        return this.reading.reading();
    }

    /**
     * Getter for the field {@link ReadingData#reading}
     *
     * @return Object functional interface Reading.
     * */
    public Reading<T> getReading() {
        return reading;
    }
}
