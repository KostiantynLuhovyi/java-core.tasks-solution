package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 14.12.2016
 * <p>
 * This class encapsulates attribute necessary for the raised of a number to a degree.
 */
public class Number {
    /**
     * A field which stores the real number to be raised to the degree.
     */
    private double number;

    /**
    * A field which stores the real value of the degree.
    * In this degree will be raised number {@link Number#number}
    * */
    private double degree;

    /**
    * The value of the variable is the result of raising to a {@link Number#degree}.
    * */
    private double resultNumber;

    /**
     * Default constructor.
     * */
    public Number() {
    }

    /**
    * The constructor initializes the {@link Number#number} of which will be raised to the {@link Number#degree}.
    * */
    public Number(double number) {
        this.number = number;
    }

    /**
     * Get {@link Number#number}
     * */
    public double getNumber() {
        return number;
    }

    /**
     * Set {@link Number#number}
     * */
    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * Get {@link Number#number}
     * */
    public double getDegree() {
        return degree;
    }

    /**
     * Set {@link Number#degree}
     * */
    public void setDegree(double degree) {
        this.degree = degree;
    }

    /**
     * Get {@link Number#resultNumber}
     * */
    public double getResultNumber() {
        return resultNumber;
    }

    /**
    * Set {@link Number#resultNumber}
    * */
    public void setResultNumber(double resultNumber) {
        this.resultNumber = resultNumber;
    }
}
