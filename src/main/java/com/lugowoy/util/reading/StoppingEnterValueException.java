package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 09-Dec-16.
 *
 * @author Konstantin
 * @version 1.0
 * @since 1.0
 * @see java.lang.Exception
 *
 * This class exception used to determine the correctness of the data input stop.
 */
public class StoppingEnterValueException extends Exception {

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
