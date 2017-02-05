package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 14.12.2016
 * <p>
 * This class encapsulates all the variables of the linear equation.
 */
public class LinearEquation {
    /**
     * The first value of the linear expression.
     */
    private double a;
    /**
     * The second value of the linear expression.
     */
    private double b;

    /**
     * Field "x" - root of the linear equation.
     */
    private double xRootOfTheLinearEquation;

    /**
     * Defaut constructor.
     */
    public LinearEquation() {
    }

    /**
     * The constructor with the parameters for the initialization of variables {@link LinearEquation#a} and {@link LinearEquation#b}
     */
    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Get value of the first variable in the linear equation.
     */
    public double getA() {
        return a;
    }

    /**
     * Set value of the first variable in the linear equation.
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Get value of the second variable in the linear equation.
     */
    public double getB() {
        return b;
    }

    /**
     * Set value of the second variable in the linear equation.
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Get  value of the "x" - root of the linear equation.
     */
    public double getXRootLinearEquation() {
        return xRootOfTheLinearEquation;
    }

    /**
     * Set value of the "x" - root of the linear equation.
     */
    public void setXRootLinearEquation(double xRootLinearEquation) {
        this.xRootOfTheLinearEquation = xRootLinearEquation;
    }
}
