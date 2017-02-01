package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

/**
 * Created by Konstantin Lugowoy on 14-Dec-16.
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 14.12.2016
 *
 * This class encapsulates attribute necessary for the performance of a number  to a degree
 * */
public class Number {

    private double number;
    private double degree;

    private double resultNumber;

    public Number() {
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public double getResultNumber() {
        return resultNumber;
    }

    public void setResultNumber(double resultNumber) {
        this.resultNumber = resultNumber;
    }
}
