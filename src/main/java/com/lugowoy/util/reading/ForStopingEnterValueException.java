package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 09-Dec-16.
 */

public class ForStopingEnterValueException extends Exception {

    public ForStopingEnterValueException() {
    }

    public ForStopingEnterValueException(String message) {
        super(message);
    }

    public ForStopingEnterValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public ForStopingEnterValueException(Throwable cause) {
        super(cause);
    }

    public ForStopingEnterValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
