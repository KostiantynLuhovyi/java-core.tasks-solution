package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 09-Dec-16.
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
