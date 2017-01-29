package com.lugowoy.util.converting;

/**
 * Created by Konstantin on 29-Jan-17.
 * @author Konstantin
 * @version 1.0
 * @since 1.1
 *
 * Class "ConvertingData" encapsulates the implementation of the functional interface function delegating duties to her execution.
 */
public class ConvertingData<T> {

    /**
     * Field functional interface.
     * */
    private Converting<T> converting;

    /**
     * The constructor takes arguments version
     * to perform the conversion to be performed by the function of the functional interface.
     * */
    public ConvertingData(Converting<T> converting) {
        this.converting = converting;
    }

    /**
     * Performing conversion.
     * */
    public void convert(T t) {
        converting.convert(t);
    }

    public Converting<T> getConverting() {
        return converting;
    }

    public void setConverting(Converting<T> converting) {
        this.converting = converting;
    }
}
