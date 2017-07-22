package com.lugowoy.util.reading;

/**
 * Created by Konstantin Lugowoy on 09-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 1.0
 * <p>
 * A class that performs the role of an exception, in order to guide the timely stopping of user input.
 * </p>
 */
public class StoppingEnterValueException extends RuntimeException {

    public StoppingEnterValueException() {
    }

    public StoppingEnterValueException(String message) {
        super(message);
    }

    public StoppingEnterValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoppingEnterValueException(Throwable cause) {
        super(cause);
    }

    public StoppingEnterValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
