package com.lugowoy.tasks.core.exchangeAnCentralNumberOfTwoNumbers;

/**
 * Created by Konstantin Lugowoy on 05-Feb-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 05.02.2017
 * <p>
 * This class encapsulating value of number.
 */
public class Number {
    /**
     * Value
     */
    private int number;

    /**
     * Default constructor.
     */
    public Number() {
    }

    /**
     * Constructor initializes {@link Number#number}
     */
    public Number(int number) {
        this.number = number;
    }

    /**
     * Get value of the number.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Set value of the number.
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
