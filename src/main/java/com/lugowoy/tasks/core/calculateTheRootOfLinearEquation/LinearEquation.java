package com.lugowoy.tasks.core.calculateTheRootOfLinearEquation;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class LinearEquation {

    private double a;
    private double b;

    private double xRootOfTheLinearEquation;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getXRootLinearEquation() {
        return xRootOfTheLinearEquation;
    }

    public void setXRootLinearEquation(double xRootLinearEquation) {
        this.xRootOfTheLinearEquation = xRootLinearEquation;
    }

}
