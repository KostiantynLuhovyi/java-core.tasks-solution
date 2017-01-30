package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 30-Jan-17.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 30.01.2017
 *
 * Class "CalculatingData" encapsulates the implementation of the functional interface function delegating duties to her execution.
 */
public class CalculatingData<T> {

    /**
     * Field to delegating duties to her exceution.
     * */
    private Calculating<T> calculating;

    public CalculatingData(Calculating<T> calculating) {
        this.calculating = calculating;
    }

    /**
     * Method to calculation.
    * */
    public T calculate(T t) {
        return this.calculating.calculate(t);
    }

    public Calculating getCalculating() {
        return calculating;
    }
}
