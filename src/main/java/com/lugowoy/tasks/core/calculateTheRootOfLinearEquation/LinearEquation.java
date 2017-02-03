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

    private double a;
    private double b;

    /**
    * Field "x" - root linear equation
     * */
    private double xRootLinearEquation;

    public LinearEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getXRootLinearEquation() {
        return xRootLinearEquation;
    }

    public void setXRootLinearEquation(double xRootLinearEquation) {
        this.xRootLinearEquation = xRootLinearEquation;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
