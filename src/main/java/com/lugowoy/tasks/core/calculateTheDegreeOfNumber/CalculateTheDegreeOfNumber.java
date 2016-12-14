package com.lugowoy.tasks.core.calculateTheDegreeOfNumber;

/**
 * Created by Konstantin on 14-Dec-16.
 */
public class CalculateTheDegreeOfNumber implements CalculableTheDegreeOfNumber {

    @Override
    public double getResultToCalculateTheDegreeOfNumber(double number, double degree) {
        double resultNumber = Math.pow(number, degree);
        return resultNumber;
    }
}
