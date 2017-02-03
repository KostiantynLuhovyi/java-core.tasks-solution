package com.lugowoy.util.calculating;

/**
 * Created by Konstantin Lugowoy on 30-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * <p>
 * An abstract class declares the root of the class hierarchy to execute a function for calculate.
 * In fact, the duty of delegating the function to calculate the implementation of the functional interface.
 * @since 30.01.2017
 */
public abstract class CalculatingData<T> {

    /**
     * Field class which is delegated to execution of calculate.
     *
     * @see com.lugowoy.util.calculating.Calculable
     * @since 30.01.2017
     */
    private Calculable<T> calculable;

    /**
     * Constructor class takes as argument realization calculating function.
     *
     * @param calculating The object or method implementation the function for calculation.
     * @see com.lugowoy.util.calculating.Calculable
     * @since 30.01.2017
     * */
    public CalculatingData(Calculable<T> calculating) {
        this.calculable = calculating;
    }

    /**
     * The method returns an instance to implement the function(functional interface) for calculation.
     *
     * @see com.lugowoy.util.calculating.Calculable
     * @since 30.01.2017
     * */
    public Calculable getCalculable() {
        return calculable;
    }

}
