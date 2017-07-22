package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy 11.11.2016.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.0
 * <p>
 * This interface is the inheritor to the interface ReadableData.
 * @see com.lugowoy.util.reading.Readable
 * @see com.lugowoy.util.reading.ReadableData
 * This interface extends the functionality of the contract declared by the interface ReadableData.
 * The implementation of this interface is designed to read data entered by the user.
 * </p>
 */
interface ReadableUserInputData extends ReadableData {

    /**
     * <p>
     * A method that reads specific data of a String type entered by the user.
     * </p>
     * @return The concrete a String type value entered by the user.
     * @since 1.0
     * */
    String readLine();

}
