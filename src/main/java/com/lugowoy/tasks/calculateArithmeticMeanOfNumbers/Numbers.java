package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

import java.io.Serializable;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public final class Numbers implements Serializable, Cloneable {

    private static final int DEFAULT_LENGTH = 10;

    private double[] numbers;

    public Numbers() {
        this.numbers = new double[DEFAULT_LENGTH];
    }

    public Numbers(double[] numbers) {
        if (numbers != null) {
            this.numbers = numbers;
        } else {
            this.numbers = new double[DEFAULT_LENGTH];
        }
    }

    public Numbers(Numbers numbers) {
        if (numbers != null) {
            this.numbers = numbers.getNumbers();
        } else {
            this.numbers = new double[DEFAULT_LENGTH];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Numbers)) return false;
        Numbers numbers1 = (Numbers) o;
        return Arrays.equals(getNumbers(), numbers1.getNumbers());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getNumbers());
    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    public double[] getNumbers() {
        return Arrays.copyOf(this.numbers, this.numbers.length);
    }

    public void setNumbers(double[] numbers) {
        if (checkArrayNonNull(numbers)) {
            this.numbers = numbers;
        }
    }

    private boolean checkArrayNonNull(double[] doubles) {
        boolean resultOfCheck = false;
        try {
            if (doubles != null) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException(new NullPointerException("The array passed by argument is equal to null."));
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }


}
