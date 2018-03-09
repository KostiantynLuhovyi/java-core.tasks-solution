package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

import com.lugowoy.helper.other.DeepCloning;

import java.io.Serializable;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public final class Numbers implements Serializable, Cloneable {

    private double[] numbers;

    public Numbers() {
    }

    public Numbers(double[] numbers) {
        //The setters are used in the constructor, since the class is declared with the modifier final.
        this.setNumbers(numbers);
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
        return "Numbers[" +
                "numbers=" + Arrays.toString(numbers) +
                ']';
    }

    @Override
    public Numbers clone() {
        Numbers numbers = new Numbers();
        try {
            numbers = (Numbers)super.clone();
            numbers.setNumbers(DeepCloning.CLONER.deepClone(this.getNumbers()));
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return numbers;
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
