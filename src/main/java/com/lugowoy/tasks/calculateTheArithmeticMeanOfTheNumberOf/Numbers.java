package com.lugowoy.tasks.calculateTheArithmeticMeanOfTheNumberOf;

import java.io.Serializable;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public class Numbers implements Serializable, Cloneable {

    private double[] numbers;

    public Numbers() {
    }

    public Numbers(double[] numbers) {
        try {
            if (checkArrayNonNull(numbers)) {
                this.numbers = numbers;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public double[] getNumbers() {
        return Arrays.copyOf(this.numbers, this.numbers.length);
    }

    private boolean checkArrayNonNull(double[] doubles) throws IllegalArgumentException {
        if (doubles != null) {
            return true;
        } else {
            throw new IllegalArgumentException(new NullPointerException("The array passed by argument is equal to null."));
        }
    }


}
