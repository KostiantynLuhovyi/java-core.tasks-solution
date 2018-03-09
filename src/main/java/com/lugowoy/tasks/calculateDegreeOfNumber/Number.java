package com.lugowoy.tasks.calculateDegreeOfNumber;

import java.io.Serializable;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 14-Dec-16. */

public class Number implements Serializable, Cloneable {

    private double number;
    private double degreeOfNumber;
    private double numberReducedToDegree;

    public Number() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Number)) return false;
        Number number1 = (Number) o;
        return Double.compare(number1.number, number) == 0 &&
                Double.compare(number1.degreeOfNumber, degreeOfNumber) == 0 &&
                Double.compare(number1.numberReducedToDegree, numberReducedToDegree) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, degreeOfNumber, numberReducedToDegree);
    }

    @Override
    public String toString() {
        return "Number[" +
                "number=" + number +
                ", degreeOfNumber=" + degreeOfNumber +
                ", numberReducedToDegree=" + numberReducedToDegree +
                ']';
    }

    @Override
    public Number clone() {
        Number number = new Number();
        try {
            number = (Number) super.clone();
            number.setNumber(this.getNumber());
            number.setDegreeOfNumber(this.getDegreeOfNumber());
            number.setNumberReducedToDegree(this.getNumberReducedToDegree());
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        if (checkAnyNumberIsPositive(number)) {
            this.number = number;
        }
    }

    public double getDegreeOfNumber() {
        return degreeOfNumber;
    }

    public void setDegreeOfNumber(double degreeOfNumber) {
        if (checkAnyNumberIsPositive(degreeOfNumber)) {
            this.degreeOfNumber = degreeOfNumber;
        }
    }

    public double getNumberReducedToDegree() {
        return numberReducedToDegree;
    }

    public void setNumberReducedToDegree(double numberReducedToDegree) {
        if (checkAnyNumberIsPositive(numberReducedToDegree)) {
            this.numberReducedToDegree = numberReducedToDegree;
        }
    }

    private static boolean checkAnyNumberIsPositive(double number) {
        boolean resultOfCheck = false;
        try {
            if (number > 0) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException("The number passed by argument is negative.");
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }

}
