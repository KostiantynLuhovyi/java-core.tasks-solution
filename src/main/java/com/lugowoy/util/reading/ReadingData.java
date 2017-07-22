package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy on 27-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.1
 * <p>
 * This class is a container that encapsulates in itself the implementation
 * of a function that performs the provision of data in accordance with the implementation passed to it.
 * Used as a container when implementing a pattern Command.
 * </p>
 * @param <T> - The type of data that has been read and will be provided.
 */
public class ReadingData<T> {

    /**
     * <p>
     * The attribute of the functional interface that will contain and grant the function to the function passed to it.
     * @see com.lugowoy.util.reading.Reading
     * </p>
     * */
    private Reading<T> reading;

    /**
     * Initialize field {@link ReadingData#reading}
     * @see com.lugowoy.util.reading.ReadingData
     */
    public ReadingData(Reading<T> reading) {
        this.reading = reading;
    }

    /**
     * <p>
     * The method delegates execution to the function that it encapsulates.
     * </p>
     * @return The result of the function that encapsulates.
     * @since 1.1
     */
    public T read() {
        return this.reading.reading();
    }

    /**
     * <p>
     * Getter for the field {@link ReadingData#reading}
     * </p>
     * @return The function that encapsulates.
     */
    public Reading<T> getReading() {
        return reading;
    }

}
