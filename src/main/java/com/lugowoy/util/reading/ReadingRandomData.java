package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy on 27-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.1
 *
 * @see com.lugowoy.util.reading.Readable
 * @see com.lugowoy.util.reading.ReadableData
 * @see com.lugowoy.util.reading.ReadableRandomData
 * <p>
 * This class implements the contract declared by the interface ReadableRandomData.
 * The purpose of the functionality implemented by this class is to read and provide the generated pseudo-random numeric data.
 * </p>
 */
public class ReadingRandomData implements ReadableRandomData {

    /**
     * <p>
     * A method that reads a concrete data of an integer type in the range from 0 to bound, inclusive.
     * </p>
     *
     * @param bound The maximum value up to which will be made the generation of pseudo-random numbers.
     * @return The concrete value of the generated integer type.
     * @since 1.0
     * */
    @Override
    public int readInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    /**
     * <p>
     * A method that reads a concrete data of an integer type.
     * </p>
     *
     * @return An integer value in the range from -100 to 100.
     * @since 1.0
     * */
    @Override
    public int readInt() {
        return RANDOM.nextInt(200) - 100;
    }

    /**
     * <p>
     * A method that reads a concrete data of an real double type.
     * </p>
     *
     * @return An real double value.
     * @since 1.0
     * */
    @Override
    public double readDouble() {
        return RANDOM.nextDouble();
    }


}
