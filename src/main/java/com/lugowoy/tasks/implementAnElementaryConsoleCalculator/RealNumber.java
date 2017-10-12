package com.lugowoy.tasks.implementAnElementaryConsoleCalculator;

/** Created by Konstantin Lugowoy on 11.09.2017. */

public class RealNumber {

    private double number;

    public RealNumber(double number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealNumber)) return false;

        RealNumber that = (RealNumber) o;

        return Double.compare(that.getNumber(), getNumber()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getNumber());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "RealNumber[" + number +
                ']';
    }

    public double getNumber() {
        return number;
    }
}
